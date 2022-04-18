// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * License information: https://spdx.github.io/spdx-spec/3-package-information/#315-declared-license
 * 
 */
public final class LicenseArgs extends com.pulumi.resources.ResourceArgs {

    public static final LicenseArgs Empty = new LicenseArgs();

    /**
     * Comments
     * 
     */
    @Import(name="comments")
      private final @Nullable Output<String> comments;

    public Output<String> comments() {
        return this.comments == null ? Codegen.empty() : this.comments;
    }

    /**
     * Expression: https://spdx.github.io/spdx-spec/appendix-IV-SPDX-license-expressions/
     * 
     */
    @Import(name="expression")
      private final @Nullable Output<String> expression;

    public Output<String> expression() {
        return this.expression == null ? Codegen.empty() : this.expression;
    }

    public LicenseArgs(
        @Nullable Output<String> comments,
        @Nullable Output<String> expression) {
        this.comments = comments;
        this.expression = expression;
    }

    private LicenseArgs() {
        this.comments = Codegen.empty();
        this.expression = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> comments;
        private @Nullable Output<String> expression;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comments = defaults.comments;
    	      this.expression = defaults.expression;
        }

        public Builder comments(@Nullable Output<String> comments) {
            this.comments = comments;
            return this;
        }
        public Builder comments(@Nullable String comments) {
            this.comments = Codegen.ofNullable(comments);
            return this;
        }
        public Builder expression(@Nullable Output<String> expression) {
            this.expression = expression;
            return this;
        }
        public Builder expression(@Nullable String expression) {
            this.expression = Codegen.ofNullable(expression);
            return this;
        }        public LicenseArgs build() {
            return new LicenseArgs(comments, expression);
        }
    }
}
