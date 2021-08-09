<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="PLANETS">
    <HTML>
        <HEAD>
            <TITLE>
                Planets
            </TITLE>
        </HEAD>
        <BODY>
            <xsl:apply-templates select="PLANET"/>
        </BODY>
    </HTML>
</xsl:template>

<xsl:template match="PLANET">
    <P>
    <xsl:value-of select="NAME"/>
    is planet number <xsl:value-of select="position()"/> from the sun.
    </P>
    <xsl:if test="position() > 1"><xsl:element name="HR"/></xsl:if>
</xsl:template>

</xsl:stylesheet>
