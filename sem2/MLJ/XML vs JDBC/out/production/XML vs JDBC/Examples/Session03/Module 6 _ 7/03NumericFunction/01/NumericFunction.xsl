<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    <html>
      <body>
      <h3>Numeric functions</h3>
	  <ul>
          <li><b>number('123')</b> = 
            <xsl:value-of select = "number('123')"/>
	      </li>	
        </ul>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
