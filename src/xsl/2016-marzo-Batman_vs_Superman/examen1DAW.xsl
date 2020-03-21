<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:output method="html" encoding="iso-8859-1"/>

	<xsl:template match="/cine">
		<html>
		   <head>
		      <title><xsl:value-of select="@nombre"/></title>
		   </head>
		   <body>
		      <div style="width: 1000px; margin: 0 auto;">
		      	<h1>
		      		<xsl:value-of select= "@nombre"/>
		      	</h1>
		         <xsl:apply-templates select="titulo"/>
				 <xsl:call-template name="horarioSesiones"/>
				 <xsl:call-template name="cartelera"/>
		      </div>
		   </body>
		</html>
	</xsl:template>
	
	<xsl:template match="titulo">
		<img src="{/cine/titulo/imagen}" width="50%"/>
		<h3>
			<xsl:value-of select="@nombre"/>
		</h3>
		<h2>
			Estreno:
			<xsl:value-of select="@estreno"/>
		</h2>
		
    </xsl:template>
	
	
	<xsl:template name="horarioSesiones">
		<table border="1" width="100%">
			<xsl:for-each select="sesiones/sesion">
				<xsl:choose>
					<xsl:when test="position() mod 2 = 1">
						<xsl:call-template name="horarioSesion">
							<xsl:with-param name="color">#666666</xsl:with-param>	
						</xsl:call-template>
					</xsl:when>
					<xsl:otherwise>
						<xsl:call-template name="horarioSesion">
							<xsl:with-param name="color">#FFFFFF</xsl:with-param>
						</xsl:call-template>
					</xsl:otherwise>
				</xsl:choose>	
			</xsl:for-each>
		</table>
	</xsl:template>
	
	<xsl:template name="horarioSesion">
		<xsl:param name="color"/>
		<tr>
			<td align ="center" style="background:{$color};">
			Sesión:
				<xsl:value-of select="position()"/>
				hora:
				<xsl:value-of select="@hora"/>
				<table border="1" width="100%" align="center">
					<xsl:call-template name="forFilas">
						<xsl:with-param name="i">
						1
						</xsl:with-param>
					</xsl:call-template>
				</table>
			</td>
		</tr>	
	</xsl:template>
	
	<xsl:template name="forFilas">
		<xsl:param name="i"/>
		<xsl:if test="$i &lt;=4">
			<tr>
				<xsl:call-template name="forColumnas">
					<xsl:with-param name="i">
						<xsl:value-of select="$i"/>
					</xsl:with-param>
					<xsl:with-param name="j">
					1
					</xsl:with-param>
				</xsl:call-template>
				<xsl:call-template name="forFilas">
					<xsl:with-param name="i">
						<xsl:value-of select="$i + 1"/>
					</xsl:with-param>
				</xsl:call-template>
			</tr>
		</xsl:if>
	</xsl:template>
	
	
	<xsl:template name="forColumnas">
		<xsl:param name="i" />
		<xsl:param name="j" />
		<xsl:if test="$j &lt;=4">
			<xsl:call-template name="celda">
				<xsl:with-param name="x">
					<xsl:value-of select="$j"/>
				</xsl:with-param>
				<xsl:with-param name="y">
					<xsl:value-of select="$i"/>
				</xsl:with-param>
			</xsl:call-template>
			<xsl:call-template name="forColumnas">
				<xsl:with-param name="i">
					<xsl:value-of select="$i"/>
				</xsl:with-param>
				<xsl:with-param name="j">
					<xsl:value-of select="$j + 1"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
	</xsl:template>
	
	
	<xsl:template name="celda">
		<xsl:param name="x"/>
		<xsl:param name="y"/>
			<td align="center">
				<xsl:choose>
					<xsl:when test="//ocupado[$x=@fila and $y=@asiento]">
						<img src="{//imagen[@id='ocupado']}"/>					
					</xsl:when>
					<xsl:otherwise>
						<img src="{/cine/imagenes/imagen[@id]}"/>
					</xsl:otherwise>
				</xsl:choose>		
			</td>
	</xsl:template>
	

	<xsl:template name="cartelera" >
		<h2> 
			Otras Películas
		</h2>
		<table border="1">
			<xsl:for-each select="cartelera/pelicula">
			<xsl:variable name="id">
				<xsl:value-of select="@id"/>
			</xsl:variable>
			<tr>
				<td>
					<img src="{/cine/imagenes/imagen[@id=$id]}"/>
				</td>
				<td align="center">
					<xsl:value-of select="@nombre"/>
				</td>
			</tr>
			</xsl:for-each>
		</table>
	</xsl:template>


















</xsl:stylesheet>