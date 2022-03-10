// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetKnowledgeBaseResult {
    /**
     * The display name of the knowledge base. The name must be 1024 bytes or less; otherwise, the creation request fails.
     * 
     */
    private final String displayName;
    /**
     * Language which represents the KnowledgeBase. When the KnowledgeBase is created/updated, this is populated for all non en-us languages. If not populated, the default language en-us applies.
     * 
     */
    private final String languageCode;
    /**
     * The knowledge base resource name. The name must be empty when creating a knowledge base. Format: `projects//locations//knowledgeBases/`.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor
    private GetKnowledgeBaseResult(
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("languageCode") String languageCode,
        @OutputCustomType.Parameter("name") String name) {
        this.displayName = displayName;
        this.languageCode = languageCode;
        this.name = name;
    }

    /**
     * The display name of the knowledge base. The name must be 1024 bytes or less; otherwise, the creation request fails.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Language which represents the KnowledgeBase. When the KnowledgeBase is created/updated, this is populated for all non en-us languages. If not populated, the default language en-us applies.
     * 
    */
    public String getLanguageCode() {
        return this.languageCode;
    }
    /**
     * The knowledge base resource name. The name must be empty when creating a knowledge base. Format: `projects//locations//knowledgeBases/`.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKnowledgeBaseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String languageCode;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKnowledgeBaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.languageCode = defaults.languageCode;
    	      this.name = defaults.name;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder languageCode(String languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetKnowledgeBaseResult build() {
            return new GetKnowledgeBaseResult(displayName, languageCode, name);
        }
    }
}
