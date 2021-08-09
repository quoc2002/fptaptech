<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    <html>
      <body>
        <ul>
          <li><b>boolean(0)</b> = 
            <xsl:value-of select = "boolean(0)"/>
	      </li>	
          <li><b>boolean(1)</b> = 
            <xsl:value-of select = "boolean(1)"/>
	      </li>	
          <li><b>boolean(-10)</b> = 
            <xsl:value-of select = "boolean(-10)"/>
	      </li>	
          <li><b>boolean('chao ban')</b> = 
            <xsl:value-of select = "boolean('chao ban')"/>
	      </li>	
          <li><b>boolean('')</b> = 
            <xsl:value-of select = "boolean('')"/>
	      </li>	
          <li><b>boolean(//book)</b> = 
            <xsl:value-of select = "boolean(//book)"/>
	      </li>	
          <li><b>boolean(/)</b> = 
            <xsl:value-of select = "boolean(/)"/>
	      </li>	
        </ul>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
