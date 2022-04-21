// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.azurenative.dataprotection.inputs.AdhocBasedTaggingCriteriaResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Adhoc trigger context
 * 
 */
public final class AdhocBasedTriggerContextResponse extends com.pulumi.resources.InvokeArgs {

    public static final AdhocBasedTriggerContextResponse Empty = new AdhocBasedTriggerContextResponse();

    /**
     * Type of the specific object - used for deserializing
     * Expected value is &#39;AdhocBasedTriggerContext&#39;.
     * 
     */
    @Import(name="objectType", required=true)
    private String objectType;

    public String objectType() {
        return this.objectType;
    }

    /**
     * Tagging Criteria containing retention tag for adhoc backup.
     * 
     */
    @Import(name="taggingCriteria", required=true)
    private AdhocBasedTaggingCriteriaResponse taggingCriteria;

    public AdhocBasedTaggingCriteriaResponse taggingCriteria() {
        return this.taggingCriteria;
    }

    private AdhocBasedTriggerContextResponse() {}

    private AdhocBasedTriggerContextResponse(AdhocBasedTriggerContextResponse $) {
        this.objectType = $.objectType;
        this.taggingCriteria = $.taggingCriteria;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdhocBasedTriggerContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdhocBasedTriggerContextResponse $;

        public Builder() {
            $ = new AdhocBasedTriggerContextResponse();
        }

        public Builder(AdhocBasedTriggerContextResponse defaults) {
            $ = new AdhocBasedTriggerContextResponse(Objects.requireNonNull(defaults));
        }

        public Builder objectType(String objectType) {
            $.objectType = objectType;
            return this;
        }

        public Builder taggingCriteria(AdhocBasedTaggingCriteriaResponse taggingCriteria) {
            $.taggingCriteria = taggingCriteria;
            return this;
        }

        public AdhocBasedTriggerContextResponse build() {
            $.objectType = Codegen.stringProp("objectType").arg($.objectType).require();
            $.taggingCriteria = Objects.requireNonNull($.taggingCriteria, "expected parameter 'taggingCriteria' to be non-null");
            return $;
        }
    }

}
