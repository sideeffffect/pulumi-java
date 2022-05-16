// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataLabellingService;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.DataLabellingService.inputs.GetAnnotationFormatArgs;
import com.pulumi.oci.DataLabellingService.inputs.GetAnnotationFormatsArgs;
import com.pulumi.oci.DataLabellingService.inputs.GetDatasetArgs;
import com.pulumi.oci.DataLabellingService.inputs.GetDatasetsArgs;
import com.pulumi.oci.DataLabellingService.outputs.GetAnnotationFormatResult;
import com.pulumi.oci.DataLabellingService.outputs.GetAnnotationFormatsResult;
import com.pulumi.oci.DataLabellingService.outputs.GetDatasetResult;
import com.pulumi.oci.DataLabellingService.outputs.GetDatasetsResult;
import com.pulumi.oci.Utilities;
import java.util.concurrent.CompletableFuture;

public final class DataLabellingServiceFunctions {
    /**
     * This data source provides details about a specific Annotation Format resource in Oracle Cloud Infrastructure Data Labeling Service service.
     * 
     * These are a static list in a given region.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetAnnotationFormatResult> getAnnotationFormat(GetAnnotationFormatArgs args) {
        return getAnnotationFormat(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Annotation Format resource in Oracle Cloud Infrastructure Data Labeling Service service.
     * 
     * These are a static list in a given region.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetAnnotationFormatResult> getAnnotationFormat(GetAnnotationFormatArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:DataLabellingService/getAnnotationFormat:getAnnotationFormat", TypeShape.of(GetAnnotationFormatResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Annotation Formats in Oracle Cloud Infrastructure Data Labeling Service service.
     * 
     * These are a static list in a given region.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetAnnotationFormatsResult> getAnnotationFormats(GetAnnotationFormatsArgs args) {
        return getAnnotationFormats(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Annotation Formats in Oracle Cloud Infrastructure Data Labeling Service service.
     * 
     * These are a static list in a given region.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetAnnotationFormatsResult> getAnnotationFormats(GetAnnotationFormatsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:DataLabellingService/getAnnotationFormats:getAnnotationFormats", TypeShape.of(GetAnnotationFormatsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Dataset resource in Oracle Cloud Infrastructure Data Labeling Service service.
     * 
     * Gets a Dataset by identifier
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDatasetResult> getDataset(GetDatasetArgs args) {
        return getDataset(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Dataset resource in Oracle Cloud Infrastructure Data Labeling Service service.
     * 
     * Gets a Dataset by identifier
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDatasetResult> getDataset(GetDatasetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:DataLabellingService/getDataset:getDataset", TypeShape.of(GetDatasetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Datasets in Oracle Cloud Infrastructure Data Labeling Service service.
     * 
     * Returns a list of Datasets.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDatasetsResult> getDatasets(GetDatasetsArgs args) {
        return getDatasets(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Datasets in Oracle Cloud Infrastructure Data Labeling Service service.
     * 
     * Returns a list of Datasets.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDatasetsResult> getDatasets(GetDatasetsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:DataLabellingService/getDatasets:getDatasets", TypeShape.of(GetDatasetsResult.class), args, Utilities.withVersion(options));
    }
}
