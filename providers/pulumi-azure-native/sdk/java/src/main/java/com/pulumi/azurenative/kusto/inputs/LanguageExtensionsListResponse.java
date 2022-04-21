// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.inputs;

import com.pulumi.azurenative.kusto.inputs.LanguageExtensionResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The list of language extension objects.
 * 
 */
public final class LanguageExtensionsListResponse extends com.pulumi.resources.InvokeArgs {

    public static final LanguageExtensionsListResponse Empty = new LanguageExtensionsListResponse();

    /**
     * The list of language extensions.
     * 
     */
    @Import(name="value")
    private @Nullable List<LanguageExtensionResponse> value;

    public Optional<List<LanguageExtensionResponse>> value() {
        return Optional.ofNullable(this.value);
    }

    private LanguageExtensionsListResponse() {}

    private LanguageExtensionsListResponse(LanguageExtensionsListResponse $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LanguageExtensionsListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LanguageExtensionsListResponse $;

        public Builder() {
            $ = new LanguageExtensionsListResponse();
        }

        public Builder(LanguageExtensionsListResponse defaults) {
            $ = new LanguageExtensionsListResponse(Objects.requireNonNull(defaults));
        }

        public Builder value(@Nullable List<LanguageExtensionResponse> value) {
            $.value = value;
            return this;
        }

        public Builder value(LanguageExtensionResponse... value) {
            return value(List.of(value));
        }

        public LanguageExtensionsListResponse build() {
            return $;
        }
    }

}
