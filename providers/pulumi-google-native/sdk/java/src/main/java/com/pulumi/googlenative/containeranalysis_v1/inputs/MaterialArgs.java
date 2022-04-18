// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MaterialArgs extends com.pulumi.resources.ResourceArgs {

    public static final MaterialArgs Empty = new MaterialArgs();

    @Import(name="digest")
      private final @Nullable Output<Map<String,String>> digest;

    public Output<Map<String,String>> digest() {
        return this.digest == null ? Codegen.empty() : this.digest;
    }

    @Import(name="uri")
      private final @Nullable Output<String> uri;

    public Output<String> uri() {
        return this.uri == null ? Codegen.empty() : this.uri;
    }

    public MaterialArgs(
        @Nullable Output<Map<String,String>> digest,
        @Nullable Output<String> uri) {
        this.digest = digest;
        this.uri = uri;
    }

    private MaterialArgs() {
        this.digest = Codegen.empty();
        this.uri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaterialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> digest;
        private @Nullable Output<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(MaterialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digest = defaults.digest;
    	      this.uri = defaults.uri;
        }

        public Builder digest(@Nullable Output<Map<String,String>> digest) {
            this.digest = digest;
            return this;
        }
        public Builder digest(@Nullable Map<String,String> digest) {
            this.digest = Codegen.ofNullable(digest);
            return this;
        }
        public Builder uri(@Nullable Output<String> uri) {
            this.uri = uri;
            return this;
        }
        public Builder uri(@Nullable String uri) {
            this.uri = Codegen.ofNullable(uri);
            return this;
        }        public MaterialArgs build() {
            return new MaterialArgs(digest, uri);
        }
    }
}
