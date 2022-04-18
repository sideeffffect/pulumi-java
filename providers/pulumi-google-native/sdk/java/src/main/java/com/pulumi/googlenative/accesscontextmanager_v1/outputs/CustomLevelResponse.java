// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.accesscontextmanager_v1.outputs.ExprResponse;
import java.util.Objects;

@CustomType
public final class CustomLevelResponse {
    /**
     * A Cloud CEL expression evaluating to a boolean.
     * 
     */
    private final ExprResponse expr;

    @CustomType.Constructor
    private CustomLevelResponse(@CustomType.Parameter("expr") ExprResponse expr) {
        this.expr = expr;
    }

    /**
     * A Cloud CEL expression evaluating to a boolean.
     * 
    */
    public ExprResponse expr() {
        return this.expr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExprResponse expr;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expr = defaults.expr;
        }

        public Builder expr(ExprResponse expr) {
            this.expr = Objects.requireNonNull(expr);
            return this;
        }        public CustomLevelResponse build() {
            return new CustomLevelResponse(expr);
        }
    }
}
