// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datadog.outputs;

import com.pulumi.azurenative.datadog.outputs.DatadogHostMetadataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatadogHostResponse {
    /**
     * @return The aliases for the host.
     * 
     */
    private final @Nullable List<String> aliases;
    /**
     * @return The Datadog integrations reporting metrics for the host.
     * 
     */
    private final @Nullable List<String> apps;
    private final @Nullable DatadogHostMetadataResponse meta;
    /**
     * @return The name of the host.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private DatadogHostResponse(
        @CustomType.Parameter("aliases") @Nullable List<String> aliases,
        @CustomType.Parameter("apps") @Nullable List<String> apps,
        @CustomType.Parameter("meta") @Nullable DatadogHostMetadataResponse meta,
        @CustomType.Parameter("name") @Nullable String name) {
        this.aliases = aliases;
        this.apps = apps;
        this.meta = meta;
        this.name = name;
    }

    /**
     * @return The aliases for the host.
     * 
     */
    public List<String> aliases() {
        return this.aliases == null ? List.of() : this.aliases;
    }
    /**
     * @return The Datadog integrations reporting metrics for the host.
     * 
     */
    public List<String> apps() {
        return this.apps == null ? List.of() : this.apps;
    }
    public Optional<DatadogHostMetadataResponse> meta() {
        return Optional.ofNullable(this.meta);
    }
    /**
     * @return The name of the host.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatadogHostResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> aliases;
        private @Nullable List<String> apps;
        private @Nullable DatadogHostMetadataResponse meta;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DatadogHostResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliases = defaults.aliases;
    	      this.apps = defaults.apps;
    	      this.meta = defaults.meta;
    	      this.name = defaults.name;
        }

        public Builder aliases(@Nullable List<String> aliases) {
            this.aliases = aliases;
            return this;
        }
        public Builder aliases(String... aliases) {
            return aliases(List.of(aliases));
        }
        public Builder apps(@Nullable List<String> apps) {
            this.apps = apps;
            return this;
        }
        public Builder apps(String... apps) {
            return apps(List.of(apps));
        }
        public Builder meta(@Nullable DatadogHostMetadataResponse meta) {
            this.meta = meta;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public DatadogHostResponse build() {
            return new DatadogHostResponse(aliases, apps, meta, name);
        }
    }
}
