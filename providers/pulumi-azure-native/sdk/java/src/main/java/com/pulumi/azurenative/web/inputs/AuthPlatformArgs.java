// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration settings of the platform of App Service Authentication/Authorization.
 * 
 */
public final class AuthPlatformArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthPlatformArgs Empty = new AuthPlatformArgs();

    /**
     * The path of the config file containing auth settings if they come from a file.
     * If the path is relative, base will the site&#39;s root directory.
     * 
     */
    @Import(name="configFilePath")
    private @Nullable Output<String> configFilePath;

    public Optional<Output<String>> configFilePath() {
        return Optional.ofNullable(this.configFilePath);
    }

    /**
     * &lt;code&gt;true&lt;/code&gt; if the Authentication / Authorization feature is enabled for the current app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The RuntimeVersion of the Authentication / Authorization feature in use for the current app.
     * The setting in this value can control the behavior of certain features in the Authentication / Authorization module.
     * 
     */
    @Import(name="runtimeVersion")
    private @Nullable Output<String> runtimeVersion;

    public Optional<Output<String>> runtimeVersion() {
        return Optional.ofNullable(this.runtimeVersion);
    }

    private AuthPlatformArgs() {}

    private AuthPlatformArgs(AuthPlatformArgs $) {
        this.configFilePath = $.configFilePath;
        this.enabled = $.enabled;
        this.runtimeVersion = $.runtimeVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthPlatformArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthPlatformArgs $;

        public Builder() {
            $ = new AuthPlatformArgs();
        }

        public Builder(AuthPlatformArgs defaults) {
            $ = new AuthPlatformArgs(Objects.requireNonNull(defaults));
        }

        public Builder configFilePath(@Nullable Output<String> configFilePath) {
            $.configFilePath = configFilePath;
            return this;
        }

        public Builder configFilePath(String configFilePath) {
            return configFilePath(Output.of(configFilePath));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder runtimeVersion(@Nullable Output<String> runtimeVersion) {
            $.runtimeVersion = runtimeVersion;
            return this;
        }

        public Builder runtimeVersion(String runtimeVersion) {
            return runtimeVersion(Output.of(runtimeVersion));
        }

        public AuthPlatformArgs build() {
            return $;
        }
    }

}
