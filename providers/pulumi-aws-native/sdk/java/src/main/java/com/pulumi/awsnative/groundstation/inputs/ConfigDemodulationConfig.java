// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.groundstation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigDemodulationConfig extends com.pulumi.resources.InvokeArgs {

    public static final ConfigDemodulationConfig Empty = new ConfigDemodulationConfig();

    @Import(name="unvalidatedJSON")
    private @Nullable String unvalidatedJSON;

    public Optional<String> unvalidatedJSON() {
        return Optional.ofNullable(this.unvalidatedJSON);
    }

    private ConfigDemodulationConfig() {}

    private ConfigDemodulationConfig(ConfigDemodulationConfig $) {
        this.unvalidatedJSON = $.unvalidatedJSON;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigDemodulationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigDemodulationConfig $;

        public Builder() {
            $ = new ConfigDemodulationConfig();
        }

        public Builder(ConfigDemodulationConfig defaults) {
            $ = new ConfigDemodulationConfig(Objects.requireNonNull(defaults));
        }

        public Builder unvalidatedJSON(@Nullable String unvalidatedJSON) {
            $.unvalidatedJSON = unvalidatedJSON;
            return this;
        }

        public ConfigDemodulationConfig build() {
            return $;
        }
    }

}
