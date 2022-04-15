// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.neptune.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEngineVersionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEngineVersionArgs Empty = new GetEngineVersionArgs();

    /**
     * DB engine. (Default: `neptune`)
     * 
     */
    @Import(name="engine")
      private final @Nullable String engine;

    public Optional<String> engine() {
        return this.engine == null ? Optional.empty() : Optional.ofNullable(this.engine);
    }

    /**
     * The name of a specific DB parameter group family. An example parameter group family is `neptune1`.
     * 
     */
    @Import(name="parameterGroupFamily")
      private final @Nullable String parameterGroupFamily;

    public Optional<String> parameterGroupFamily() {
        return this.parameterGroupFamily == null ? Optional.empty() : Optional.ofNullable(this.parameterGroupFamily);
    }

    /**
     * Ordered list of preferred engine versions. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. If both the `version` and `preferred_versions` arguments are not configured, the data source will return the default version for the engine.
     * 
     */
    @Import(name="preferredVersions")
      private final @Nullable List<String> preferredVersions;

    public List<String> preferredVersions() {
        return this.preferredVersions == null ? List.of() : this.preferredVersions;
    }

    /**
     * Version of the DB engine. For example, `1.0.1.0`, `1.0.2.2`, and `1.0.3.0`. If both the `version` and `preferred_versions` arguments are not configured, the data source will return the default version for the engine.
     * 
     */
    @Import(name="version")
      private final @Nullable String version;

    public Optional<String> version() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public GetEngineVersionArgs(
        @Nullable String engine,
        @Nullable String parameterGroupFamily,
        @Nullable List<String> preferredVersions,
        @Nullable String version) {
        this.engine = engine;
        this.parameterGroupFamily = parameterGroupFamily;
        this.preferredVersions = preferredVersions;
        this.version = version;
    }

    private GetEngineVersionArgs() {
        this.engine = null;
        this.parameterGroupFamily = null;
        this.preferredVersions = List.of();
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEngineVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String engine;
        private @Nullable String parameterGroupFamily;
        private @Nullable List<String> preferredVersions;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEngineVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.engine = defaults.engine;
    	      this.parameterGroupFamily = defaults.parameterGroupFamily;
    	      this.preferredVersions = defaults.preferredVersions;
    	      this.version = defaults.version;
        }

        public Builder engine(@Nullable String engine) {
            this.engine = engine;
            return this;
        }
        public Builder parameterGroupFamily(@Nullable String parameterGroupFamily) {
            this.parameterGroupFamily = parameterGroupFamily;
            return this;
        }
        public Builder preferredVersions(@Nullable List<String> preferredVersions) {
            this.preferredVersions = preferredVersions;
            return this;
        }
        public Builder preferredVersions(String... preferredVersions) {
            return preferredVersions(List.of(preferredVersions));
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public GetEngineVersionArgs build() {
            return new GetEngineVersionArgs(engine, parameterGroupFamily, preferredVersions, version);
        }
    }
}
