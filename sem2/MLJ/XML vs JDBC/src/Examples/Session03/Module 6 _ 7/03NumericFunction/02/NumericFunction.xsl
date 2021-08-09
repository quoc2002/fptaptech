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
          <li><b>number('chao')</b> = 
            <xsl:value-of select = "number('chao')"/>
	      </li>	
          <li><b>number('12.5' div '2')</b> = 
            <xsl:value-of select = "number('12.5' div '2')"/>
	      </li>	
          <li><b>ceiling(8.5)</b> = 
            <xsl:value-of select = "ceiling(8.5)"/>
	      </li>	
          <li><b>floor(8.5)</b> = 
            <xsl:value-of select = "floor(8.5)"/>
	      </li>	
          <li><b>round(8.5)</b> = 
            <xsl:value-of select = "round(8.5)"/>
	      </li>	
        </ul>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
