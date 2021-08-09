<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    <html>
      <body>
      <h3>String functions</h3>
	    <ul>
          <li><b>translate('Bboks','bok','ook')</b> = 
            <xsl:value-of select = "translate('Bboks','bok','ook')"/>
	      </li>	
        </ul>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
