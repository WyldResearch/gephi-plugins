/*
Copyright 2008-2010 Gephi
Authors : Mathieu Bastian <mathieu.bastian@gephi.org>
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.gephi.ui.ranking.plugin;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import org.gephi.ranking.api.Ranking;
import org.gephi.ranking.plugin.transformer.LabelSizeTransformerBuilder.LabelSizeTransformer;
import org.gephi.ranking.api.Transformer;
import org.gephi.ranking.spi.TransformerUI;
import org.openide.util.NbBundle;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author Mathieu Bastian
 */
@ServiceProvider(service = TransformerUI.class, position = 400)
public class LabelSizeTransformerUI implements TransformerUI {

    public Icon getIcon() {
        return new ImageIcon(getClass().getResource("/org/gephi/ui/ranking/plugin/resources/labelsize.png"));
    }

    public String getDisplayName() {
        return NbBundle.getMessage(LabelSizeTransformerUI.class, "LabelSizeTransformerUI.name");
    }

    public boolean isUIForTransformer(Transformer transformer) {
        return transformer instanceof LabelSizeTransformer;
    }

    public JPanel getPanel(Transformer transformer, Ranking ranking) {
        return new SizeTransformerPanel(transformer, ranking);
    }
}
