// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp;

import com.pulumi.core.TypeShape;
import com.pulumi.core.internal.Optionals;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.config.inputs.Batching;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("gcp");
    public Optional<String> accessApprovalCustomEndpoint() {
        return config.getObject("accessApprovalCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> accessContextManagerCustomEndpoint() {
        return config.getObject("accessContextManagerCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> accessToken() {
        return config.getObject("accessToken",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> activeDirectoryCustomEndpoint() {
        return config.getObject("activeDirectoryCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> apiGatewayCustomEndpoint() {
        return config.getObject("apiGatewayCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> apigeeCustomEndpoint() {
        return config.getObject("apigeeCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> appEngineCustomEndpoint() {
        return config.getObject("appEngineCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> artifactRegistryCustomEndpoint() {
        return config.getObject("artifactRegistryCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> assuredWorkloadsCustomEndpoint() {
        return config.getObject("assuredWorkloadsCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<Batching> batching() {
        return config.getObject("batching",TypeShape.<Batching>builder(Batching.class).build());
    }
    public Optional<String> bigQueryCustomEndpoint() {
        return config.getObject("bigQueryCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> bigqueryConnectionCustomEndpoint() {
        return config.getObject("bigqueryConnectionCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> bigqueryDataTransferCustomEndpoint() {
        return config.getObject("bigqueryDataTransferCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> bigqueryReservationCustomEndpoint() {
        return config.getObject("bigqueryReservationCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> bigtableCustomEndpoint() {
        return config.getObject("bigtableCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> billingCustomEndpoint() {
        return config.getObject("billingCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> billingProject() {
        return config.getObject("billingProject",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> binaryAuthorizationCustomEndpoint() {
        return config.getObject("binaryAuthorizationCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> cloudAssetCustomEndpoint() {
        return config.getObject("cloudAssetCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> cloudBillingCustomEndpoint() {
        return config.getObject("cloudBillingCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> cloudBuildCustomEndpoint() {
        return config.getObject("cloudBuildCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> cloudBuildWorkerPoolCustomEndpoint() {
        return config.getObject("cloudBuildWorkerPoolCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> cloudFunctionsCustomEndpoint() {
        return config.getObject("cloudFunctionsCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> cloudIdentityCustomEndpoint() {
        return config.getObject("cloudIdentityCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> cloudIotCustomEndpoint() {
        return config.getObject("cloudIotCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> cloudResourceManagerCustomEndpoint() {
        return config.getObject("cloudResourceManagerCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> cloudRunCustomEndpoint() {
        return config.getObject("cloudRunCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> cloudSchedulerCustomEndpoint() {
        return config.getObject("cloudSchedulerCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> cloudTasksCustomEndpoint() {
        return config.getObject("cloudTasksCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> composerCustomEndpoint() {
        return config.getObject("composerCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> computeCustomEndpoint() {
        return config.getObject("computeCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> containerAnalysisCustomEndpoint() {
        return config.getObject("containerAnalysisCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> containerAwsCustomEndpoint() {
        return config.getObject("containerAwsCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> containerAzureCustomEndpoint() {
        return config.getObject("containerAzureCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> containerCustomEndpoint() {
        return config.getObject("containerCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> credentials() {
        return config.getObject("credentials",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> dataCatalogCustomEndpoint() {
        return config.getObject("dataCatalogCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> dataFusionCustomEndpoint() {
        return config.getObject("dataFusionCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> dataLossPreventionCustomEndpoint() {
        return config.getObject("dataLossPreventionCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> dataflowCustomEndpoint() {
        return config.getObject("dataflowCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> dataprocCustomEndpoint() {
        return config.getObject("dataprocCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> dataprocMetastoreCustomEndpoint() {
        return config.getObject("dataprocMetastoreCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> datastoreCustomEndpoint() {
        return config.getObject("datastoreCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> deploymentManagerCustomEndpoint() {
        return config.getObject("deploymentManagerCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> dialogflowCustomEndpoint() {
        return config.getObject("dialogflowCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> dialogflowCxCustomEndpoint() {
        return config.getObject("dialogflowCxCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<Boolean> disableGooglePartnerName() {
        return config.getObject("disableGooglePartnerName",TypeShape.<Boolean>builder(Boolean.class).build());
    }
    public Optional<String> dnsCustomEndpoint() {
        return config.getObject("dnsCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> essentialContactsCustomEndpoint() {
        return config.getObject("essentialContactsCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> eventarcCustomEndpoint() {
        return config.getObject("eventarcCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> filestoreCustomEndpoint() {
        return config.getObject("filestoreCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> firebaseCustomEndpoint() {
        return config.getObject("firebaseCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> firestoreCustomEndpoint() {
        return config.getObject("firestoreCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> gameServicesCustomEndpoint() {
        return config.getObject("gameServicesCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> gkeHubCustomEndpoint() {
        return config.getObject("gkeHubCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> gkehubFeatureCustomEndpoint() {
        return config.getObject("gkehubFeatureCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> googlePartnerName() {
        return config.getObject("googlePartnerName",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> healthcareCustomEndpoint() {
        return config.getObject("healthcareCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> iamBetaCustomEndpoint() {
        return config.getObject("iamBetaCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> iamCredentialsCustomEndpoint() {
        return config.getObject("iamCredentialsCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> iamCustomEndpoint() {
        return config.getObject("iamCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> iapCustomEndpoint() {
        return config.getObject("iapCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> identityPlatformCustomEndpoint() {
        return config.getObject("identityPlatformCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> impersonateServiceAccount() {
        return config.getObject("impersonateServiceAccount",TypeShape.<String>builder(String.class).build());
    }
    public Optional<List<String>> impersonateServiceAccountDelegates() {
        return config.getObject("impersonateServiceAccountDelegates",TypeShape.<List<String>>builder(List.class).addParameter(String.class).build());
    }
    public Optional<String> kmsCustomEndpoint() {
        return config.getObject("kmsCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> loggingCustomEndpoint() {
        return config.getObject("loggingCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> memcacheCustomEndpoint() {
        return config.getObject("memcacheCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> mlEngineCustomEndpoint() {
        return config.getObject("mlEngineCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> monitoringCustomEndpoint() {
        return config.getObject("monitoringCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> networkConnectivityCustomEndpoint() {
        return config.getObject("networkConnectivityCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> networkManagementCustomEndpoint() {
        return config.getObject("networkManagementCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> networkServicesCustomEndpoint() {
        return config.getObject("networkServicesCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> notebooksCustomEndpoint() {
        return config.getObject("notebooksCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> orgPolicyCustomEndpoint() {
        return config.getObject("orgPolicyCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> osConfigCustomEndpoint() {
        return config.getObject("osConfigCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> osLoginCustomEndpoint() {
        return config.getObject("osLoginCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> privatecaCustomEndpoint() {
        return config.getObject("privatecaCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> project() {
        return Optionals.combine(config.getObject("project",TypeShape.<String>builder(String.class).build()), Optional.ofNullable(Utilities.getEnv("GOOGLE_PROJECT", "GOOGLE_CLOUD_PROJECT", "GCLOUD_PROJECT", "CLOUDSDK_CORE_PROJECT").orElse(null)));
    }
    public Optional<String> pubsubCustomEndpoint() {
        return config.getObject("pubsubCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> pubsubLiteCustomEndpoint() {
        return config.getObject("pubsubLiteCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> recaptchaEnterpriseCustomEndpoint() {
        return config.getObject("recaptchaEnterpriseCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> redisCustomEndpoint() {
        return config.getObject("redisCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> region() {
        return Optionals.combine(config.getObject("region",TypeShape.<String>builder(String.class).build()), Optional.ofNullable(Utilities.getEnv("GOOGLE_REGION", "GCLOUD_REGION", "CLOUDSDK_COMPUTE_REGION").orElse(null)));
    }
    public Optional<String> requestReason() {
        return config.getObject("requestReason",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> requestTimeout() {
        return config.getObject("requestTimeout",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> resourceManagerCustomEndpoint() {
        return config.getObject("resourceManagerCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> resourceManagerV2CustomEndpoint() {
        return config.getObject("resourceManagerV2CustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> runtimeConfigCustomEndpoint() {
        return config.getObject("runtimeConfigCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> runtimeconfigCustomEndpoint() {
        return config.getObject("runtimeconfigCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<List<String>> scopes() {
        return config.getObject("scopes",TypeShape.<List<String>>builder(List.class).addParameter(String.class).build());
    }
    public Optional<String> secretManagerCustomEndpoint() {
        return config.getObject("secretManagerCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> securityCenterCustomEndpoint() {
        return config.getObject("securityCenterCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> securityScannerCustomEndpoint() {
        return config.getObject("securityScannerCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> serviceDirectoryCustomEndpoint() {
        return config.getObject("serviceDirectoryCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> serviceManagementCustomEndpoint() {
        return config.getObject("serviceManagementCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> serviceNetworkingCustomEndpoint() {
        return config.getObject("serviceNetworkingCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> serviceUsageCustomEndpoint() {
        return config.getObject("serviceUsageCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> sourceRepoCustomEndpoint() {
        return config.getObject("sourceRepoCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> spannerCustomEndpoint() {
        return config.getObject("spannerCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> sqlCustomEndpoint() {
        return config.getObject("sqlCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> storageCustomEndpoint() {
        return config.getObject("storageCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> storageTransferCustomEndpoint() {
        return config.getObject("storageTransferCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> tagsCustomEndpoint() {
        return config.getObject("tagsCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> tpuCustomEndpoint() {
        return config.getObject("tpuCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<Boolean> userProjectOverride() {
        return config.getObject("userProjectOverride",TypeShape.<Boolean>builder(Boolean.class).build());
    }
    public Optional<String> vertexAiCustomEndpoint() {
        return config.getObject("vertexAiCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> vpcAccessCustomEndpoint() {
        return config.getObject("vpcAccessCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> workflowsCustomEndpoint() {
        return config.getObject("workflowsCustomEndpoint",TypeShape.<String>builder(String.class).build());
    }
    public Optional<String> zone() {
        return Optionals.combine(config.getObject("zone",TypeShape.<String>builder(String.class).build()), Optional.ofNullable(Utilities.getEnv("GOOGLE_ZONE", "GCLOUD_ZONE", "CLOUDSDK_COMPUTE_ZONE").orElse(null)));
    }
}
