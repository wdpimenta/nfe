package com.fincatto.nfe2.classes.nota;

import org.simpleframework.xml.Element;

import com.fincatto.nfe2.classes.NFBase;
import com.fincatto.nfe2.classes.NFNotaInfoSituacaoTributariaIPI;

public class NFNotaInfoItemImpostoIPINT extends NFBase {

    @Element(name = "IPINT", required = true)
    private NFNotaInfoSituacaoTributariaIPI situacaoTributariaIPI;

    public NFNotaInfoSituacaoTributariaIPI getSituacaoTributariaIPI() {
        return this.situacaoTributariaIPI;
    }

    public void setSituacaoTributariaIPI(final NFNotaInfoSituacaoTributariaIPI situacaoTributariaIPI) {
        this.situacaoTributariaIPI = situacaoTributariaIPI;
    }
}