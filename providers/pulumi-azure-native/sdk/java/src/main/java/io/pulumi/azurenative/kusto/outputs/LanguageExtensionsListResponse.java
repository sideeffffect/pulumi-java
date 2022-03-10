// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.outputs;

import io.pulumi.azurenative.kusto.outputs.LanguageExtensionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class LanguageExtensionsListResponse {
    /**
     * The list of language extensions.
     * 
     */
    private final @Nullable List<LanguageExtensionResponse> value;

    @OutputCustomType.Constructor
    private LanguageExtensionsListResponse(@OutputCustomType.Parameter("value") @Nullable List<LanguageExtensionResponse> value) {
        this.value = value;
    }

    /**
     * The list of language extensions.
     * 
    */
    public List<LanguageExtensionResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LanguageExtensionsListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<LanguageExtensionResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(LanguageExtensionsListResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(@Nullable List<LanguageExtensionResponse> value) {
            this.value = value;
            return this;
        }
        public LanguageExtensionsListResponse build() {
            return new LanguageExtensionsListResponse(value);
        }
    }
}
