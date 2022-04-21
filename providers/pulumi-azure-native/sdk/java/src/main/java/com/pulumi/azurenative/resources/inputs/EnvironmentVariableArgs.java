// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The environment variable to pass to the script in the container instance.
 * 
 */
public final class EnvironmentVariableArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentVariableArgs Empty = new EnvironmentVariableArgs();

    /**
     * The name of the environment variable.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The value of the secure environment variable.
     * 
     */
    @Import(name="secureValue")
    private @Nullable Output<String> secureValue;

    public Optional<Output<String>> secureValue() {
        return Optional.ofNullable(this.secureValue);
    }

    /**
     * The value of the environment variable.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private EnvironmentVariableArgs() {}

    private EnvironmentVariableArgs(EnvironmentVariableArgs $) {
        this.name = $.name;
        this.secureValue = $.secureValue;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentVariableArgs $;

        public Builder() {
            $ = new EnvironmentVariableArgs();
        }

        public Builder(EnvironmentVariableArgs defaults) {
            $ = new EnvironmentVariableArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder secureValue(@Nullable Output<String> secureValue) {
            $.secureValue = secureValue;
            return this;
        }

        public Builder secureValue(String secureValue) {
            return secureValue(Output.of(secureValue));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public EnvironmentVariableArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
