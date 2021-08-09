<xsl:stylesheet xmlns:xsl="http://www.w3.org/TR/WD-xsl">
<xsl:template match="/">
<html> 
	<head> 
		<title>Icons In Cricket</title> 
	</head> 
	<body> 
		<h2>Icons In Cricket</h2> 
		<table border="2" cellpadding="3"> 
			<tr>
				<td>Player</td>
				<td>No. Of Catches</td> 
				<td>No. Of 100's</td> 
				<td>No. Of 50's</td> 
			</tr> 
			<xsl:for-each select="cricket/player" order-by ="-catches">
			<tr>
				<td><xsl:value-of select="name"/></td> 
				<td><xsl:value-of select="catches"/></td>
				<td><xsl:value-of select="no_100"/></td> 
				<td><xsl:value-of select="no_50"/></td>				
			</tr>
			</xsl:for-each> 
		</table>
	</body> 
</html>
</xsl:template>
</xsl:stylesheet>