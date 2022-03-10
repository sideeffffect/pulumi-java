// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CrawlerMongodbTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CrawlerMongodbTargetArgs Empty = new CrawlerMongodbTargetArgs();

    /**
     * The name of the connection to use to connect to the Delta table target.
     * 
     */
    @InputImport(name="connectionName", required=true)
      private final Input<String> connectionName;

    public Input<String> getConnectionName() {
        return this.connectionName;
    }

    /**
     * The path of the Amazon DocumentDB or MongoDB target (database/collection).
     * 
     */
    @InputImport(name="path", required=true)
      private final Input<String> path;

    public Input<String> getPath() {
        return this.path;
    }

    /**
     * Indicates whether to scan all the records, or to sample rows from the table. Scanning all the records can take a long time when the table is not a high throughput table. Default value is `true`.
     * 
     */
    @InputImport(name="scanAll")
      private final @Nullable Input<Boolean> scanAll;

    public Input<Boolean> getScanAll() {
        return this.scanAll == null ? Input.empty() : this.scanAll;
    }

    public CrawlerMongodbTargetArgs(
        Input<String> connectionName,
        Input<String> path,
        @Nullable Input<Boolean> scanAll) {
        this.connectionName = Objects.requireNonNull(connectionName, "expected parameter 'connectionName' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.scanAll = scanAll;
    }

    private CrawlerMongodbTargetArgs() {
        this.connectionName = Input.empty();
        this.path = Input.empty();
        this.scanAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CrawlerMongodbTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> connectionName;
        private Input<String> path;
        private @Nullable Input<Boolean> scanAll;

        public Builder() {
    	      // Empty
        }

        public Builder(CrawlerMongodbTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionName = defaults.connectionName;
    	      this.path = defaults.path;
    	      this.scanAll = defaults.scanAll;
        }

        public Builder connectionName(Input<String> connectionName) {
            this.connectionName = Objects.requireNonNull(connectionName);
            return this;
        }

        public Builder connectionName(String connectionName) {
            this.connectionName = Input.of(Objects.requireNonNull(connectionName));
            return this;
        }

        public Builder path(Input<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder path(String path) {
            this.path = Input.of(Objects.requireNonNull(path));
            return this;
        }

        public Builder scanAll(@Nullable Input<Boolean> scanAll) {
            this.scanAll = scanAll;
            return this;
        }

        public Builder scanAll(@Nullable Boolean scanAll) {
            this.scanAll = Input.ofNullable(scanAll);
            return this;
        }
        public CrawlerMongodbTargetArgs build() {
            return new CrawlerMongodbTargetArgs(connectionName, path, scanAll);
        }
    }
}
