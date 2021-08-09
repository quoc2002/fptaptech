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
    <xsl:choose>
        <xsl:when test="@COLOR = 'RED'">
            <FONT color="#FF0000">
                <xsl:value-of select="NAME"/>
            </FONT>
        </xsl:when>
        <xsl:when test="@COLOR = 'WHITE'">
            <I>
                <xsl:value-of select="NAME"/>
            </I>
        </xsl:when>
        <xsl:when test="@COLOR = 'BLUE'">
            <FONT color="#0000FF">
                <xsl:value-of select="NAME"/>
            </FONT>
        </xsl:when>
        <xsl:otherwise>
             <PRE>
                 <xsl:value-of select="."/>
             </PRE>
        </xsl:otherwise>
    </xsl:choose>
</xsl:template>

</xsl:stylesheet>

