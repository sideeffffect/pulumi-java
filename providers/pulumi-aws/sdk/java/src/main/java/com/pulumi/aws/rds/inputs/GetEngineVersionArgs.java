// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEngineVersionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEngineVersionArgs Empty = new GetEngineVersionArgs();

    /**
     * DB engine. Engine values include `aurora`, `aurora-mysql`, `aurora-postgresql`, `docdb`, `mariadb`, `mysql`, `neptune`, `oracle-ee`, `oracle-se`, `oracle-se1`, `oracle-se2`, `postgres`, `sqlserver-ee`, `sqlserver-ex`, `sqlserver-se`, and `sqlserver-web`.
     * 
     */
    @Import(name="engine", required=true)
    private String engine;

    public String engine() {
        return this.engine;
    }

    /**
     * The name of a specific DB parameter group family. Examples of parameter group families are `mysql8.0`, `mariadb10.4`, and `postgres12`.
     * 
     */
    @Import(name="parameterGroupFamily")
    private @Nullable String parameterGroupFamily;

    public Optional<String> parameterGroupFamily() {
        return Optional.ofNullable(this.parameterGroupFamily);
    }

    /**
     * Ordered list of preferred engine versions. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. If both the `version` and `preferred_versions` arguments are not configured, the data source will return the default version for the engine.
     * 
     */
    @Import(name="preferredVersions")
    private @Nullable List<String> preferredVersions;

    public Optional<List<String>> preferredVersions() {
        return Optional.ofNullable(this.preferredVersions);
    }

    /**
     * Version of the DB engine. For example, `5.7.22`, `10.1.34`, and `12.3`. If both the `version` and `preferred_versions` arguments are not configured, the data source will return the default version for the engine.
     * 
     */
    @Import(name="version")
    private @Nullable String version;

    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    private GetEngineVersionArgs() {}

    private GetEngineVersionArgs(GetEngineVersionArgs $) {
        this.engine = $.engine;
        this.parameterGroupFamily = $.parameterGroupFamily;
        this.preferredVersions = $.preferredVersions;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEngineVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEngineVersionArgs $;

        public Builder() {
            $ = new GetEngineVersionArgs();
        }

        public Builder(GetEngineVersionArgs defaults) {
            $ = new GetEngineVersionArgs(Objects.requireNonNull(defaults));
        }

        public Builder engine(String engine) {
            $.engine = engine;
            return this;
        }

        public Builder parameterGroupFamily(@Nullable String parameterGroupFamily) {
            $.parameterGroupFamily = parameterGroupFamily;
            return this;
        }

        public Builder preferredVersions(@Nullable List<String> preferredVersions) {
            $.preferredVersions = preferredVersions;
            return this;
        }

        public Builder preferredVersions(String... preferredVersions) {
            return preferredVersions(List.of(preferredVersions));
        }

        public Builder version(@Nullable String version) {
            $.version = version;
            return this;
        }

        public GetEngineVersionArgs build() {
            $.engine = Objects.requireNonNull($.engine, "expected parameter 'engine' to be non-null");
            return $;
        }
    }

}
