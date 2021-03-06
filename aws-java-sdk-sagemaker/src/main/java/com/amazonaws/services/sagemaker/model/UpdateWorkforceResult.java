/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateWorkforce" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorkforceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A single private workforce. You can create one private work force in each AWS Region. By default, any
     * workforce-related API operation used in a specific region will apply to the workforce created in that region. To
     * learn how to create a private workforce, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private.html">Create a Private
     * Workforce</a>.
     * </p>
     */
    private Workforce workforce;

    /**
     * <p>
     * A single private workforce. You can create one private work force in each AWS Region. By default, any
     * workforce-related API operation used in a specific region will apply to the workforce created in that region. To
     * learn how to create a private workforce, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private.html">Create a Private
     * Workforce</a>.
     * </p>
     * 
     * @param workforce
     *        A single private workforce. You can create one private work force in each AWS Region. By default, any
     *        workforce-related API operation used in a specific region will apply to the workforce created in that
     *        region. To learn how to create a private workforce, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private.html">Create a Private
     *        Workforce</a>.
     */

    public void setWorkforce(Workforce workforce) {
        this.workforce = workforce;
    }

    /**
     * <p>
     * A single private workforce. You can create one private work force in each AWS Region. By default, any
     * workforce-related API operation used in a specific region will apply to the workforce created in that region. To
     * learn how to create a private workforce, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private.html">Create a Private
     * Workforce</a>.
     * </p>
     * 
     * @return A single private workforce. You can create one private work force in each AWS Region. By default, any
     *         workforce-related API operation used in a specific region will apply to the workforce created in that
     *         region. To learn how to create a private workforce, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private.html">Create a Private
     *         Workforce</a>.
     */

    public Workforce getWorkforce() {
        return this.workforce;
    }

    /**
     * <p>
     * A single private workforce. You can create one private work force in each AWS Region. By default, any
     * workforce-related API operation used in a specific region will apply to the workforce created in that region. To
     * learn how to create a private workforce, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private.html">Create a Private
     * Workforce</a>.
     * </p>
     * 
     * @param workforce
     *        A single private workforce. You can create one private work force in each AWS Region. By default, any
     *        workforce-related API operation used in a specific region will apply to the workforce created in that
     *        region. To learn how to create a private workforce, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private.html">Create a Private
     *        Workforce</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkforceResult withWorkforce(Workforce workforce) {
        setWorkforce(workforce);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWorkforce() != null)
            sb.append("Workforce: ").append(getWorkforce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorkforceResult == false)
            return false;
        UpdateWorkforceResult other = (UpdateWorkforceResult) obj;
        if (other.getWorkforce() == null ^ this.getWorkforce() == null)
            return false;
        if (other.getWorkforce() != null && other.getWorkforce().equals(this.getWorkforce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkforce() == null) ? 0 : getWorkforce().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorkforceResult clone() {
        try {
            return (UpdateWorkforceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
