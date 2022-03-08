// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConfigurationTemplateSetting {
    /**
     * A unique name for this Template.
     * 
     */
    private final String name;
    private final String namespace;
    private final @Nullable String resource;
    private final String value;

    @OutputCustomType.Constructor({"name","namespace","resource","value"})
    private ConfigurationTemplateSetting(
        String name,
        String namespace,
        @Nullable String resource,
        String value) {
        this.name = name;
        this.namespace = namespace;
        this.resource = resource;
        this.value = value;
    }

    /**
     * A unique name for this Template.
     * 
    */
    public String getName() {
        return this.name;
    }
    public String getNamespace() {
        return this.namespace;
    }
    public Optional<String> getResource() {
        return Optional.ofNullable(this.resource);
    }
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationTemplateSetting defaults) {
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

        public Builder(ConfigurationTemplateSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.resource = defaults.resource;
    	      this.value = defaults.value;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder setResource(@Nullable String resource) {
            this.resource = resource;
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ConfigurationTemplateSetting build() {
            return new ConfigurationTemplateSetting(name, namespace, resource, value);
        }
    }
}
