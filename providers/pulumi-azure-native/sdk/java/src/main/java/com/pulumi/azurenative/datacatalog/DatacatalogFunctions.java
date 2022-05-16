// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datacatalog;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.datacatalog.inputs.GetADCCatalogArgs;
import com.pulumi.azurenative.datacatalog.outputs.GetADCCatalogResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DatacatalogFunctions {
    /**
     * Azure Data Catalog.
     * API Version: 2016-03-30.
     * 
     */
    public static CompletableFuture<GetADCCatalogResult> getADCCatalog(GetADCCatalogArgs args) {
        return getADCCatalog(args, InvokeOptions.Empty);
    }
    /**
     * Azure Data Catalog.
     * API Version: 2016-03-30.
     * 
     */
    public static CompletableFuture<GetADCCatalogResult> getADCCatalog(GetADCCatalogArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datacatalog:getADCCatalog", TypeShape.of(GetADCCatalogResult.class), args, Utilities.withVersion(options));
    }
}
