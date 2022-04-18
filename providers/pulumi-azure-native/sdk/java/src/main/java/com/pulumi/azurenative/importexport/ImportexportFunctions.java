// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.importexport;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.importexport.inputs.GetJobArgs;
import com.pulumi.azurenative.importexport.inputs.ListBitLockerKeyArgs;
import com.pulumi.azurenative.importexport.outputs.GetJobResult;
import com.pulumi.azurenative.importexport.outputs.ListBitLockerKeyResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ImportexportFunctions {
    /**
     * Contains the job information.
     * API Version: 2020-08-01.
     * 
     */
    public static CompletableFuture<GetJobResult> getJob(GetJobArgs args) {
        return getJob(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetJobResult> getJob(GetJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:importexport:getJob", TypeShape.of(GetJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * GetBitLockerKeys response
     * API Version: 2020-08-01.
     * 
     */
    public static CompletableFuture<ListBitLockerKeyResult> listBitLockerKey(ListBitLockerKeyArgs args) {
        return listBitLockerKey(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<ListBitLockerKeyResult> listBitLockerKey(ListBitLockerKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:importexport:listBitLockerKey", TypeShape.of(ListBitLockerKeyResult.class), args, Utilities.withVersion(options));
    }
}
