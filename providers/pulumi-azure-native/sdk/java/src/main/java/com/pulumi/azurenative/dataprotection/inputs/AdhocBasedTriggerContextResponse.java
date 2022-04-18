// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.azurenative.dataprotection.inputs.AdhocBasedTaggingCriteriaResponse;
import com.pulumi.core.annotations.Import;
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
     * Expected value is 'AdhocBasedTriggerContext'.
     * 
     */
    @Import(name="objectType", required=true)
      private final String objectType;

    public String objectType() {
        return this.objectType;
    }

    /**
     * Tagging Criteria containing retention tag for adhoc backup.
     * 
     */
    @Import(name="taggingCriteria", required=true)
      private final AdhocBasedTaggingCriteriaResponse taggingCriteria;

    public AdhocBasedTaggingCriteriaResponse taggingCriteria() {
        return this.taggingCriteria;
    }

    public AdhocBasedTriggerContextResponse(
        String objectType,
        AdhocBasedTaggingCriteriaResponse taggingCriteria) {
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
        this.taggingCriteria = Objects.requireNonNull(taggingCriteria, "expected parameter 'taggingCriteria' to be non-null");
    }

    private AdhocBasedTriggerContextResponse() {
        this.objectType = null;
        this.taggingCriteria = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdhocBasedTriggerContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String objectType;
        private AdhocBasedTaggingCriteriaResponse taggingCriteria;

        public Builder() {
    	      // Empty
        }

        public Builder(AdhocBasedTriggerContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectType = defaults.objectType;
    	      this.taggingCriteria = defaults.taggingCriteria;
        }

        public Builder objectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public Builder taggingCriteria(AdhocBasedTaggingCriteriaResponse taggingCriteria) {
            this.taggingCriteria = Objects.requireNonNull(taggingCriteria);
            return this;
        }        public AdhocBasedTriggerContextResponse build() {
            return new AdhocBasedTriggerContextResponse(objectType, taggingCriteria);
        }
    }
}
