// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firestore.v1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.firestore.v1.inputs.GetDatabaseArgs;
import com.pulumi.googlenative.firestore.v1.inputs.GetDatabasePlainArgs;
import com.pulumi.googlenative.firestore.v1.inputs.GetIndexArgs;
import com.pulumi.googlenative.firestore.v1.inputs.GetIndexPlainArgs;
import com.pulumi.googlenative.firestore.v1.outputs.GetDatabaseResult;
import com.pulumi.googlenative.firestore.v1.outputs.GetIndexResult;
import java.util.concurrent.CompletableFuture;

public final class Firestore_v1Functions {
    /**
     * Gets information about a database.
     * 
     */
    public static Output<GetDatabaseResult> getDatabase(GetDatabaseArgs args) {
        return getDatabase(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about a database.
     * 
     */
    public static CompletableFuture<GetDatabaseResult> getDatabasePlain(GetDatabasePlainArgs args) {
        return getDatabasePlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about a database.
     * 
     */
    public static Output<GetDatabaseResult> getDatabase(GetDatabaseArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:firestore/v1:getDatabase", TypeShape.of(GetDatabaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets information about a database.
     * 
     */
    public static CompletableFuture<GetDatabaseResult> getDatabasePlain(GetDatabasePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:firestore/v1:getDatabase", TypeShape.of(GetDatabaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a composite index.
     * 
     */
    public static Output<GetIndexResult> getIndex(GetIndexArgs args) {
        return getIndex(args, InvokeOptions.Empty);
    }
    /**
     * Gets a composite index.
     * 
     */
    public static CompletableFuture<GetIndexResult> getIndexPlain(GetIndexPlainArgs args) {
        return getIndexPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a composite index.
     * 
     */
    public static Output<GetIndexResult> getIndex(GetIndexArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:firestore/v1:getIndex", TypeShape.of(GetIndexResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a composite index.
     * 
     */
    public static CompletableFuture<GetIndexResult> getIndexPlain(GetIndexPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:firestore/v1:getIndex", TypeShape.of(GetIndexResult.class), args, Utilities.withVersion(options));
    }
}
