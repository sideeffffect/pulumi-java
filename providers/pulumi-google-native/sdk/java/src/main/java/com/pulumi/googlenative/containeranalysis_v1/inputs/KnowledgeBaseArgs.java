// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KnowledgeBaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final KnowledgeBaseArgs Empty = new KnowledgeBaseArgs();

    /**
     * The KB name (generally of the form KB[0-9]+ (e.g., KB123456)).
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A link to the KB in the [Windows update catalog] (https://www.catalog.update.microsoft.com/).
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> url() {
        return this.url == null ? Codegen.empty() : this.url;
    }

    public KnowledgeBaseArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> url) {
        this.name = name;
        this.url = url;
    }

    private KnowledgeBaseArgs() {
        this.name = Codegen.empty();
        this.url = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KnowledgeBaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(KnowledgeBaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.url = defaults.url;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = Codegen.ofNullable(url);
            return this;
        }        public KnowledgeBaseArgs build() {
            return new KnowledgeBaseArgs(name, url);
        }
    }
}
