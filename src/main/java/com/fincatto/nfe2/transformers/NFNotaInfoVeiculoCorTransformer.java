package com.fincatto.nfe2.transformers;

import org.simpleframework.xml.transform.Transform;

import com.fincatto.nfe2.classes.NFNotaInfoVeiculoCor;

public class NFNotaInfoVeiculoCorTransformer implements Transform<NFNotaInfoVeiculoCor> {

    @Override
    public NFNotaInfoVeiculoCor read(final String codigoVeiculoCor) throws Exception {
        return NFNotaInfoVeiculoCor.valueOfCodigo(codigoVeiculoCor);
    }

    @Override
    public String write(final NFNotaInfoVeiculoCor veiculoCor) throws Exception {
        return veiculoCor.getCodigo();
    }
}