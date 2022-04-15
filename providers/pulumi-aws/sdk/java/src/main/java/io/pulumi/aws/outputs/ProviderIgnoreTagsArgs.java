// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ProviderIgnoreTagsArgs {
    private final @Nullable Output<List<String>> keyPrefixes;
    private final @Nullable Output<List<String>> keys;

    @CustomType.Constructor
    private ProviderIgnoreTagsArgs(
        @CustomType.Parameter("keyPrefixes") @Nullable Output<List<String>> keyPrefixes,
        @CustomType.Parameter("keys") @Nullable Output<List<String>> keys) {
        this.keyPrefixes = keyPrefixes;
        this.keys = keys;
    }

    public @Nullable Output<List<String>> keyPrefixes() {
        return this.keyPrefixes;
    }
    public @Nullable Output<List<String>> keys() {
        return this.keys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderIgnoreTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> keyPrefixes;
        private @Nullable Output<List<String>> keys;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderIgnoreTagsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyPrefixes = defaults.keyPrefixes;
    	      this.keys = defaults.keys;
        }

        public Builder keyPrefixes(@Nullable Output<List<String>> keyPrefixes) {
            this.keyPrefixes = keyPrefixes;
            return this;
        }
        public Builder keys(@Nullable Output<List<String>> keys) {
            this.keys = keys;
            return this;
        }        public ProviderIgnoreTagsArgs build() {
            return new ProviderIgnoreTagsArgs(keyPrefixes, keys);
        }
    }
}
