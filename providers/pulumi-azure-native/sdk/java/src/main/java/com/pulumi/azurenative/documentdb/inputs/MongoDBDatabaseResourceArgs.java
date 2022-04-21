// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Cosmos DB MongoDB database resource object
 * 
 */
public final class MongoDBDatabaseResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final MongoDBDatabaseResourceArgs Empty = new MongoDBDatabaseResourceArgs();

    /**
     * Name of the Cosmos DB MongoDB database
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    private MongoDBDatabaseResourceArgs() {}

    private MongoDBDatabaseResourceArgs(MongoDBDatabaseResourceArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MongoDBDatabaseResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MongoDBDatabaseResourceArgs $;

        public Builder() {
            $ = new MongoDBDatabaseResourceArgs();
        }

        public Builder(MongoDBDatabaseResourceArgs defaults) {
            $ = new MongoDBDatabaseResourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public MongoDBDatabaseResourceArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
