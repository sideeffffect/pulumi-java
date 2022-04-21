// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.UrlRedirectActionParametersResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the url redirect action for the delivery rule.
 * 
 */
public final class UrlRedirectActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final UrlRedirectActionResponse Empty = new UrlRedirectActionResponse();

    /**
     * The name of the action for the delivery rule.
     * Expected value is &#39;UrlRedirect&#39;.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Defines the parameters for the action.
     * 
     */
    @Import(name="parameters", required=true)
    private UrlRedirectActionParametersResponse parameters;

    public UrlRedirectActionParametersResponse parameters() {
        return this.parameters;
    }

    private UrlRedirectActionResponse() {}

    private UrlRedirectActionResponse(UrlRedirectActionResponse $) {
        this.name = $.name;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UrlRedirectActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UrlRedirectActionResponse $;

        public Builder() {
            $ = new UrlRedirectActionResponse();
        }

        public Builder(UrlRedirectActionResponse defaults) {
            $ = new UrlRedirectActionResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder parameters(UrlRedirectActionParametersResponse parameters) {
            $.parameters = parameters;
            return this;
        }

        public UrlRedirectActionResponse build() {
            $.name = Codegen.stringProp("name").arg($.name).require();
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            return $;
        }
    }

}
