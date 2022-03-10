// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.WebApplicationFirewallMatchVariable;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Define match variables.
 * 
 */
public final class MatchVariableArgs extends io.pulumi.resources.ResourceArgs {

    public static final MatchVariableArgs Empty = new MatchVariableArgs();

    /**
     * The selector of match variable.
     * 
     */
    @InputImport(name="selector")
      private final @Nullable Input<String> selector;

    public Input<String> getSelector() {
        return this.selector == null ? Input.empty() : this.selector;
    }

    /**
     * Match Variable.
     * 
     */
    @InputImport(name="variableName", required=true)
      private final Input<Either<String,WebApplicationFirewallMatchVariable>> variableName;

    public Input<Either<String,WebApplicationFirewallMatchVariable>> getVariableName() {
        return this.variableName;
    }

    public MatchVariableArgs(
        @Nullable Input<String> selector,
        Input<Either<String,WebApplicationFirewallMatchVariable>> variableName) {
        this.selector = selector;
        this.variableName = Objects.requireNonNull(variableName, "expected parameter 'variableName' to be non-null");
    }

    private MatchVariableArgs() {
        this.selector = Input.empty();
        this.variableName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MatchVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> selector;
        private Input<Either<String,WebApplicationFirewallMatchVariable>> variableName;

        public Builder() {
    	      // Empty
        }

        public Builder(MatchVariableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selector = defaults.selector;
    	      this.variableName = defaults.variableName;
        }

        public Builder selector(@Nullable Input<String> selector) {
            this.selector = selector;
            return this;
        }

        public Builder selector(@Nullable String selector) {
            this.selector = Input.ofNullable(selector);
            return this;
        }

        public Builder variableName(Input<Either<String,WebApplicationFirewallMatchVariable>> variableName) {
            this.variableName = Objects.requireNonNull(variableName);
            return this;
        }

        public Builder variableName(Either<String,WebApplicationFirewallMatchVariable> variableName) {
            this.variableName = Input.of(Objects.requireNonNull(variableName));
            return this;
        }
        public MatchVariableArgs build() {
            return new MatchVariableArgs(selector, variableName);
        }
    }
}
