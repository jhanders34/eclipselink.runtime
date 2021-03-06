/*******************************************************************************
 * Copyright (c) 2006, 2015 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.persistence.jpa.jpql.parser;

import org.eclipse.persistence.jpa.jpql.WordParser;

/**
 * This factory creates an {@link EntityTypeLiteral}, which wraps an entity name.
 *
 * @see EntityTypeLiteral
 *
 * @version 2.4
 * @since 2.3
 * @author Pascal Filion
 */
@SuppressWarnings("nls")
public final class EntityTypeLiteralFactory extends AbstractLiteralExpressionFactory {

    /**
     * The unique identifier for this {@link EntityTypeLiteralFactory}.
     */
    public static final String ID = "entity_type_literal";

    /**
     * Creates a new <code>EntityTypeLiteralFactory</code>.
     */
    public EntityTypeLiteralFactory() {
        super(ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected AbstractExpression buildExpression(AbstractExpression parent,
                                                 WordParser wordParser,
                                                 String word,
                                                 AbstractExpression expression,
                                                 boolean tolerant) {

        expression = new EntityTypeLiteral(parent, word);
        expression.parse(wordParser, tolerant);
        return expression;
    }
}
