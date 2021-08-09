<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    <html>
      <body>
        <ul>
          <li><b>boolean(0)</b> = 
            <xsl:value-of select = "boolean(0)"/>
           </li>	
        </ul>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
