// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wisdom.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KnowledgeBaseRenderingConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final KnowledgeBaseRenderingConfiguration Empty = new KnowledgeBaseRenderingConfiguration();

    @Import(name="templateUri")
      private final @Nullable String templateUri;

    public Optional<String> templateUri() {
        return this.templateUri == null ? Optional.empty() : Optional.ofNullable(this.templateUri);
    }

    public KnowledgeBaseRenderingConfiguration(@Nullable String templateUri) {
        this.templateUri = templateUri;
    }

    private KnowledgeBaseRenderingConfiguration() {
        this.templateUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KnowledgeBaseRenderingConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String templateUri;

        public Builder() {
    	      // Empty
        }

        public Builder(KnowledgeBaseRenderingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.templateUri = defaults.templateUri;
        }

        public Builder templateUri(@Nullable String templateUri) {
            this.templateUri = templateUri;
            return this;
        }        public KnowledgeBaseRenderingConfiguration build() {
            return new KnowledgeBaseRenderingConfiguration(templateUri);
        }
    }
}
