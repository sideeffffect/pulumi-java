// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnvironmentAllSetting {
    /**
     * A unique name for this Environment. This name is used
     * in the application URL
     * 
     */
    private final String name;
    private final String namespace;
    private final @Nullable String resource;
    private final String value;

    @CustomType.Constructor
    private EnvironmentAllSetting(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespace") String namespace,
        @CustomType.Parameter("resource") @Nullable String resource,
        @CustomType.Parameter("value") String value) {
        this.name = name;
        this.namespace = namespace;
        this.resource = resource;
        this.value = value;
    }

    /**
     * A unique name for this Environment. This name is used
     * in the application URL
     * 
    */
    public String name() {
        return this.name;
    }
    public String namespace() {
        return this.namespace;
    }
    public Optional<String> resource() {
        return Optional.ofNullable(this.resource);
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentAllSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String namespace;
        private @Nullable String resource;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentAllSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.resource = defaults.resource;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder resource(@Nullable String resource) {
            this.resource = resource;
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public EnvironmentAllSetting build() {
            return new EnvironmentAllSetting(name, namespace, resource, value);
        }
    }
}
