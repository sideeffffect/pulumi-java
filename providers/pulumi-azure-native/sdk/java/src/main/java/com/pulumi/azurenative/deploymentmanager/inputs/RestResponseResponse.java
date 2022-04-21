// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.inputs;

import com.pulumi.azurenative.deploymentmanager.inputs.RestResponseResponseRegex;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties that make up the expected REST response
 * 
 */
public final class RestResponseResponse extends com.pulumi.resources.InvokeArgs {

    public static final RestResponseResponse Empty = new RestResponseResponse();

    /**
     * The regular expressions to match the response content with.
     * 
     */
    @Import(name="regex")
    private @Nullable RestResponseResponseRegex regex;

    public Optional<RestResponseResponseRegex> regex() {
        return Optional.ofNullable(this.regex);
    }

    /**
     * The HTTP status codes expected in a successful health check response. The response is expected to match one of the given status codes. If no expected status codes are provided, default expected status code is 200 OK.
     * 
     */
    @Import(name="successStatusCodes")
    private @Nullable List<String> successStatusCodes;

    public Optional<List<String>> successStatusCodes() {
        return Optional.ofNullable(this.successStatusCodes);
    }

    private RestResponseResponse() {}

    private RestResponseResponse(RestResponseResponse $) {
        this.regex = $.regex;
        this.successStatusCodes = $.successStatusCodes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestResponseResponse $;

        public Builder() {
            $ = new RestResponseResponse();
        }

        public Builder(RestResponseResponse defaults) {
            $ = new RestResponseResponse(Objects.requireNonNull(defaults));
        }

        public Builder regex(@Nullable RestResponseResponseRegex regex) {
            $.regex = regex;
            return this;
        }

        public Builder successStatusCodes(@Nullable List<String> successStatusCodes) {
            $.successStatusCodes = successStatusCodes;
            return this;
        }

        public Builder successStatusCodes(String... successStatusCodes) {
            return successStatusCodes(List.of(successStatusCodes));
        }

        public RestResponseResponse build() {
            return $;
        }
    }

}
