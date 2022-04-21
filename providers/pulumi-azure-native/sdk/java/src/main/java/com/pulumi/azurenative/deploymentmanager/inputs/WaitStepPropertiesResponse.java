// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.inputs;

import com.pulumi.azurenative.deploymentmanager.inputs.WaitStepAttributesResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the properties of a Wait step.
 * 
 */
public final class WaitStepPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final WaitStepPropertiesResponse Empty = new WaitStepPropertiesResponse();

    /**
     * The Wait attributes
     * 
     */
    @Import(name="attributes", required=true)
    private WaitStepAttributesResponse attributes;

    public WaitStepAttributesResponse attributes() {
        return this.attributes;
    }

    /**
     * The type of step.
     * Expected value is &#39;Wait&#39;.
     * 
     */
    @Import(name="stepType", required=true)
    private String stepType;

    public String stepType() {
        return this.stepType;
    }

    private WaitStepPropertiesResponse() {}

    private WaitStepPropertiesResponse(WaitStepPropertiesResponse $) {
        this.attributes = $.attributes;
        this.stepType = $.stepType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WaitStepPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WaitStepPropertiesResponse $;

        public Builder() {
            $ = new WaitStepPropertiesResponse();
        }

        public Builder(WaitStepPropertiesResponse defaults) {
            $ = new WaitStepPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder attributes(WaitStepAttributesResponse attributes) {
            $.attributes = attributes;
            return this;
        }

        public Builder stepType(String stepType) {
            $.stepType = stepType;
            return this;
        }

        public WaitStepPropertiesResponse build() {
            $.attributes = Objects.requireNonNull($.attributes, "expected parameter 'attributes' to be non-null");
            $.stepType = Codegen.stringProp("stepType").arg($.stepType).require();
            return $;
        }
    }

}
