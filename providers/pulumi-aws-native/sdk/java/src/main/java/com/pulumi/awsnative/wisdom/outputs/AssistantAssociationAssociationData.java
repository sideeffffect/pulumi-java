// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wisdom.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AssistantAssociationAssociationData {
    private final String knowledgeBaseId;

    @CustomType.Constructor
    private AssistantAssociationAssociationData(@CustomType.Parameter("knowledgeBaseId") String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    public String knowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssistantAssociationAssociationData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String knowledgeBaseId;

        public Builder() {
    	      // Empty
        }

        public Builder(AssistantAssociationAssociationData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.knowledgeBaseId = defaults.knowledgeBaseId;
        }

        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = Objects.requireNonNull(knowledgeBaseId);
            return this;
        }        public AssistantAssociationAssociationData build() {
            return new AssistantAssociationAssociationData(knowledgeBaseId);
        }
    }
}
