// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.foo.nested_module;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceArgs Empty = new ResourceArgs();

    @Import(name="bar")
      private final @Nullable Output<String> bar;

    public Output<String> bar() {
        return this.bar == null ? Codegen.empty() : this.bar;
    }

    public ResourceArgs(@Nullable Output<String> bar) {
        this.bar = bar;
    }

    private ResourceArgs() {
        this.bar = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bar;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bar = defaults.bar;
        }

        public Builder bar(@Nullable Output<String> bar) {
            this.bar = Codegen.secret(bar);
            return this;
        }
        public Builder bar(@Nullable String bar) {
            this.bar = Codegen.secret(bar);
            return this;
        }        public ResourceArgs build() {
            return new ResourceArgs(bar);
        }
    }
}
