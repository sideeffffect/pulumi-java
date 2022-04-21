// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.ForwardProxyArgs;
import com.pulumi.azurenative.web.inputs.HttpSettingsRoutesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration settings of the HTTP requests for authentication and authorization requests made against App Service Authentication/Authorization.
 * 
 */
public final class HttpSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpSettingsArgs Empty = new HttpSettingsArgs();

    /**
     * The configuration settings of a forward proxy used to make the requests.
     * 
     */
    @Import(name="forwardProxy")
    private @Nullable Output<ForwardProxyArgs> forwardProxy;

    public Optional<Output<ForwardProxyArgs>> forwardProxy() {
        return Optional.ofNullable(this.forwardProxy);
    }

    /**
     * &lt;code&gt;false&lt;/code&gt; if the authentication/authorization responses not having the HTTPS scheme are permissible; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    @Import(name="requireHttps")
    private @Nullable Output<Boolean> requireHttps;

    public Optional<Output<Boolean>> requireHttps() {
        return Optional.ofNullable(this.requireHttps);
    }

    /**
     * The configuration settings of the paths HTTP requests.
     * 
     */
    @Import(name="routes")
    private @Nullable Output<HttpSettingsRoutesArgs> routes;

    public Optional<Output<HttpSettingsRoutesArgs>> routes() {
        return Optional.ofNullable(this.routes);
    }

    private HttpSettingsArgs() {}

    private HttpSettingsArgs(HttpSettingsArgs $) {
        this.forwardProxy = $.forwardProxy;
        this.requireHttps = $.requireHttps;
        this.routes = $.routes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpSettingsArgs $;

        public Builder() {
            $ = new HttpSettingsArgs();
        }

        public Builder(HttpSettingsArgs defaults) {
            $ = new HttpSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder forwardProxy(@Nullable Output<ForwardProxyArgs> forwardProxy) {
            $.forwardProxy = forwardProxy;
            return this;
        }

        public Builder forwardProxy(ForwardProxyArgs forwardProxy) {
            return forwardProxy(Output.of(forwardProxy));
        }

        public Builder requireHttps(@Nullable Output<Boolean> requireHttps) {
            $.requireHttps = requireHttps;
            return this;
        }

        public Builder requireHttps(Boolean requireHttps) {
            return requireHttps(Output.of(requireHttps));
        }

        public Builder routes(@Nullable Output<HttpSettingsRoutesArgs> routes) {
            $.routes = routes;
            return this;
        }

        public Builder routes(HttpSettingsRoutesArgs routes) {
            return routes(Output.of(routes));
        }

        public HttpSettingsArgs build() {
            return $;
        }
    }

}
