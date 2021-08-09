<?xml version="1.0"?>
<xsl:stylesheet	version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
>
  <xsl:output method="html"/>
  <xsl:template match="/">
    <html>
      <BODY>
       <H3>Node-set Function</H3>
       <TABLE width="60%" border="1">
         <TR>
           <TD width="25%"><B>namespace-uri()</B></TD>
           <TD width="25%"><B>name()</B></TD>
           <TD width="25%"><B>local-name()</B></TD>
           <TD width="25%"><B>text()</B></TD>
         </TR>
         <xsl:apply-templates/>
       </TABLE>
      </BODY>
    </html> 
  </xsl:template>

  <xsl:template match="*">
         <TR>
           <TD>
             <xsl:value-of select="namespace-uri()"/>
           </TD>
           <TD>
             <xsl:value-of select="name()"/>
           </TD>
           <TD>
             <xsl:value-of select="local-name()"/>
           </TD>
           <TD>
             <xsl:value-of select="text()"/>
           </TD>
         </TR>
         <xsl:apply-templates select="*"/>
  </xsl:template>

</xsl:stylesheet>
