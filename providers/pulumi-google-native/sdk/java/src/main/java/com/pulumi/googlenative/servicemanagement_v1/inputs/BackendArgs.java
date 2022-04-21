// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.servicemanagement_v1.inputs.BackendRuleArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * `Backend` defines the backend configuration for a service.
 * 
 */
public final class BackendArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendArgs Empty = new BackendArgs();

    /**
     * A list of API backend rules that apply to individual API methods. **NOTE:** All service configuration rules follow &#34;last one wins&#34; order.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<BackendRuleArgs>> rules;

    public Optional<Output<List<BackendRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private BackendArgs() {}

    private BackendArgs(BackendArgs $) {
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendArgs $;

        public Builder() {
            $ = new BackendArgs();
        }

        public Builder(BackendArgs defaults) {
            $ = new BackendArgs(Objects.requireNonNull(defaults));
        }

        public Builder rules(@Nullable Output<List<BackendRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(List<BackendRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        public Builder rules(BackendRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public BackendArgs build() {
            return $;
        }
    }

}
