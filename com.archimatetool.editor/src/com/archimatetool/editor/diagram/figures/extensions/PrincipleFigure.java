/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.editor.diagram.figures.extensions;

import org.eclipse.swt.graphics.Image;

import com.archimatetool.editor.ui.IArchimateImages;
import com.archimatetool.model.IDiagramModelArchimateObject;


/**
 * Figure for a Principle
 * 
 * @author Phillip Beauvoir
 */
public class PrincipleFigure extends AbstractMotivationFigure {
    
    public PrincipleFigure(IDiagramModelArchimateObject diagramModelObject) {
        super(diagramModelObject);
    }

    @Override
    protected Image getImage() {
        return IArchimateImages.ImageFactory.getImage(IArchimateImages.ICON_PRINCIPLE_16);
    }
}