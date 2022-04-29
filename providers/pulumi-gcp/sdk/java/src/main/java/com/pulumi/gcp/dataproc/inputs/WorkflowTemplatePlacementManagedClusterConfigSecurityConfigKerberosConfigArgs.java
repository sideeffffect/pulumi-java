// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs extends ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs();

    /**
     * Optional. The admin server (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
     * 
     */
    @Import(name="crossRealmTrustAdminServer")
    private @Nullable Output<String> crossRealmTrustAdminServer;

    /**
     * @return Optional. The admin server (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
     * 
     */
    public Optional<Output<String>> crossRealmTrustAdminServer() {
        return Optional.ofNullable(this.crossRealmTrustAdminServer);
    }

    /**
     * Optional. The KDC (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
     * 
     */
    @Import(name="crossRealmTrustKdc")
    private @Nullable Output<String> crossRealmTrustKdc;

    /**
     * @return Optional. The KDC (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
     * 
     */
    public Optional<Output<String>> crossRealmTrustKdc() {
        return Optional.ofNullable(this.crossRealmTrustKdc);
    }

    /**
     * Optional. The remote realm the Dataproc on-cluster KDC will trust, should the user enable cross realm trust.
     * 
     */
    @Import(name="crossRealmTrustRealm")
    private @Nullable Output<String> crossRealmTrustRealm;

    /**
     * @return Optional. The remote realm the Dataproc on-cluster KDC will trust, should the user enable cross realm trust.
     * 
     */
    public Optional<Output<String>> crossRealmTrustRealm() {
        return Optional.ofNullable(this.crossRealmTrustRealm);
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the shared password between the on-cluster Kerberos realm and the remote trusted realm, in a cross realm trust relationship.
     * 
     */
    @Import(name="crossRealmTrustSharedPassword")
    private @Nullable Output<String> crossRealmTrustSharedPassword;

    /**
     * @return Optional. The Cloud Storage URI of a KMS encrypted file containing the shared password between the on-cluster Kerberos realm and the remote trusted realm, in a cross realm trust relationship.
     * 
     */
    public Optional<Output<String>> crossRealmTrustSharedPassword() {
        return Optional.ofNullable(this.crossRealmTrustSharedPassword);
    }

    /**
     * Optional. Flag to indicate whether to Kerberize the cluster (default: false). Set this field to true to enable Kerberos on a cluster.
     * 
     */
    @Import(name="enableKerberos")
    private @Nullable Output<Boolean> enableKerberos;

    /**
     * @return Optional. Flag to indicate whether to Kerberize the cluster (default: false). Set this field to true to enable Kerberos on a cluster.
     * 
     */
    public Optional<Output<Boolean>> enableKerberos() {
        return Optional.ofNullable(this.enableKerberos);
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the master key of the KDC database.
     * 
     */
    @Import(name="kdcDbKey")
    private @Nullable Output<String> kdcDbKey;

    /**
     * @return Optional. The Cloud Storage URI of a KMS encrypted file containing the master key of the KDC database.
     * 
     */
    public Optional<Output<String>> kdcDbKey() {
        return Optional.ofNullable(this.kdcDbKey);
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided key. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    @Import(name="keyPassword")
    private @Nullable Output<String> keyPassword;

    /**
     * @return Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided key. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    public Optional<Output<String>> keyPassword() {
        return Optional.ofNullable(this.keyPassword);
    }

    /**
     * Optional. The Cloud Storage URI of the keystore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    @Import(name="keystore")
    private @Nullable Output<String> keystore;

    /**
     * @return Optional. The Cloud Storage URI of the keystore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    public Optional<Output<String>> keystore() {
        return Optional.ofNullable(this.keystore);
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided keystore. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    @Import(name="keystorePassword")
    private @Nullable Output<String> keystorePassword;

    /**
     * @return Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided keystore. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    public Optional<Output<String>> keystorePassword() {
        return Optional.ofNullable(this.keystorePassword);
    }

    /**
     * Optional. The uri of the KMS key used to encrypt various sensitive files.
     * 
     */
    @Import(name="kmsKey")
    private @Nullable Output<String> kmsKey;

    /**
     * @return Optional. The uri of the KMS key used to encrypt various sensitive files.
     * 
     */
    public Optional<Output<String>> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }

    /**
     * Optional. The name of the on-cluster Kerberos realm. If not specified, the uppercased domain of hostnames will be the realm.
     * 
     */
    @Import(name="realm")
    private @Nullable Output<String> realm;

    /**
     * @return Optional. The name of the on-cluster Kerberos realm. If not specified, the uppercased domain of hostnames will be the realm.
     * 
     */
    public Optional<Output<String>> realm() {
        return Optional.ofNullable(this.realm);
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the root principal password.
     * 
     */
    @Import(name="rootPrincipalPassword")
    private @Nullable Output<String> rootPrincipalPassword;

    /**
     * @return Optional. The Cloud Storage URI of a KMS encrypted file containing the root principal password.
     * 
     */
    public Optional<Output<String>> rootPrincipalPassword() {
        return Optional.ofNullable(this.rootPrincipalPassword);
    }

    /**
     * Optional. The lifetime of the ticket granting ticket, in hours. If not specified, or user specifies 0, then default value 10 will be used.
     * 
     */
    @Import(name="tgtLifetimeHours")
    private @Nullable Output<Integer> tgtLifetimeHours;

    /**
     * @return Optional. The lifetime of the ticket granting ticket, in hours. If not specified, or user specifies 0, then default value 10 will be used.
     * 
     */
    public Optional<Output<Integer>> tgtLifetimeHours() {
        return Optional.ofNullable(this.tgtLifetimeHours);
    }

    /**
     * Optional. The Cloud Storage URI of the truststore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    @Import(name="truststore")
    private @Nullable Output<String> truststore;

    /**
     * @return Optional. The Cloud Storage URI of the truststore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    public Optional<Output<String>> truststore() {
        return Optional.ofNullable(this.truststore);
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided truststore. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    @Import(name="truststorePassword")
    private @Nullable Output<String> truststorePassword;

    /**
     * @return Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided truststore. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    public Optional<Output<String>> truststorePassword() {
        return Optional.ofNullable(this.truststorePassword);
    }

    private WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs() {}

    private WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs(WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs $) {
        this.crossRealmTrustAdminServer = $.crossRealmTrustAdminServer;
        this.crossRealmTrustKdc = $.crossRealmTrustKdc;
        this.crossRealmTrustRealm = $.crossRealmTrustRealm;
        this.crossRealmTrustSharedPassword = $.crossRealmTrustSharedPassword;
        this.enableKerberos = $.enableKerberos;
        this.kdcDbKey = $.kdcDbKey;
        this.keyPassword = $.keyPassword;
        this.keystore = $.keystore;
        this.keystorePassword = $.keystorePassword;
        this.kmsKey = $.kmsKey;
        this.realm = $.realm;
        this.rootPrincipalPassword = $.rootPrincipalPassword;
        this.tgtLifetimeHours = $.tgtLifetimeHours;
        this.truststore = $.truststore;
        this.truststorePassword = $.truststorePassword;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs $;

        public Builder() {
            $ = new WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs();
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs defaults) {
            $ = new WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param crossRealmTrustAdminServer Optional. The admin server (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
         * 
         * @return builder
         * 
         */
        public Builder crossRealmTrustAdminServer(@Nullable Output<String> crossRealmTrustAdminServer) {
            $.crossRealmTrustAdminServer = crossRealmTrustAdminServer;
            return this;
        }

        /**
         * @param crossRealmTrustAdminServer Optional. The admin server (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
         * 
         * @return builder
         * 
         */
        public Builder crossRealmTrustAdminServer(String crossRealmTrustAdminServer) {
            return crossRealmTrustAdminServer(Output.of(crossRealmTrustAdminServer));
        }

        /**
         * @param crossRealmTrustKdc Optional. The KDC (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
         * 
         * @return builder
         * 
         */
        public Builder crossRealmTrustKdc(@Nullable Output<String> crossRealmTrustKdc) {
            $.crossRealmTrustKdc = crossRealmTrustKdc;
            return this;
        }

        /**
         * @param crossRealmTrustKdc Optional. The KDC (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
         * 
         * @return builder
         * 
         */
        public Builder crossRealmTrustKdc(String crossRealmTrustKdc) {
            return crossRealmTrustKdc(Output.of(crossRealmTrustKdc));
        }

        /**
         * @param crossRealmTrustRealm Optional. The remote realm the Dataproc on-cluster KDC will trust, should the user enable cross realm trust.
         * 
         * @return builder
         * 
         */
        public Builder crossRealmTrustRealm(@Nullable Output<String> crossRealmTrustRealm) {
            $.crossRealmTrustRealm = crossRealmTrustRealm;
            return this;
        }

        /**
         * @param crossRealmTrustRealm Optional. The remote realm the Dataproc on-cluster KDC will trust, should the user enable cross realm trust.
         * 
         * @return builder
         * 
         */
        public Builder crossRealmTrustRealm(String crossRealmTrustRealm) {
            return crossRealmTrustRealm(Output.of(crossRealmTrustRealm));
        }

        /**
         * @param crossRealmTrustSharedPassword Optional. The Cloud Storage URI of a KMS encrypted file containing the shared password between the on-cluster Kerberos realm and the remote trusted realm, in a cross realm trust relationship.
         * 
         * @return builder
         * 
         */
        public Builder crossRealmTrustSharedPassword(@Nullable Output<String> crossRealmTrustSharedPassword) {
            $.crossRealmTrustSharedPassword = crossRealmTrustSharedPassword;
            return this;
        }

        /**
         * @param crossRealmTrustSharedPassword Optional. The Cloud Storage URI of a KMS encrypted file containing the shared password between the on-cluster Kerberos realm and the remote trusted realm, in a cross realm trust relationship.
         * 
         * @return builder
         * 
         */
        public Builder crossRealmTrustSharedPassword(String crossRealmTrustSharedPassword) {
            return crossRealmTrustSharedPassword(Output.of(crossRealmTrustSharedPassword));
        }

        /**
         * @param enableKerberos Optional. Flag to indicate whether to Kerberize the cluster (default: false). Set this field to true to enable Kerberos on a cluster.
         * 
         * @return builder
         * 
         */
        public Builder enableKerberos(@Nullable Output<Boolean> enableKerberos) {
            $.enableKerberos = enableKerberos;
            return this;
        }

        /**
         * @param enableKerberos Optional. Flag to indicate whether to Kerberize the cluster (default: false). Set this field to true to enable Kerberos on a cluster.
         * 
         * @return builder
         * 
         */
        public Builder enableKerberos(Boolean enableKerberos) {
            return enableKerberos(Output.of(enableKerberos));
        }

        /**
         * @param kdcDbKey Optional. The Cloud Storage URI of a KMS encrypted file containing the master key of the KDC database.
         * 
         * @return builder
         * 
         */
        public Builder kdcDbKey(@Nullable Output<String> kdcDbKey) {
            $.kdcDbKey = kdcDbKey;
            return this;
        }

        /**
         * @param kdcDbKey Optional. The Cloud Storage URI of a KMS encrypted file containing the master key of the KDC database.
         * 
         * @return builder
         * 
         */
        public Builder kdcDbKey(String kdcDbKey) {
            return kdcDbKey(Output.of(kdcDbKey));
        }

        /**
         * @param keyPassword Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided key. For the self-signed certificate, this password is generated by Dataproc.
         * 
         * @return builder
         * 
         */
        public Builder keyPassword(@Nullable Output<String> keyPassword) {
            $.keyPassword = keyPassword;
            return this;
        }

        /**
         * @param keyPassword Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided key. For the self-signed certificate, this password is generated by Dataproc.
         * 
         * @return builder
         * 
         */
        public Builder keyPassword(String keyPassword) {
            return keyPassword(Output.of(keyPassword));
        }

        /**
         * @param keystore Optional. The Cloud Storage URI of the keystore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
         * 
         * @return builder
         * 
         */
        public Builder keystore(@Nullable Output<String> keystore) {
            $.keystore = keystore;
            return this;
        }

        /**
         * @param keystore Optional. The Cloud Storage URI of the keystore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
         * 
         * @return builder
         * 
         */
        public Builder keystore(String keystore) {
            return keystore(Output.of(keystore));
        }

        /**
         * @param keystorePassword Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided keystore. For the self-signed certificate, this password is generated by Dataproc.
         * 
         * @return builder
         * 
         */
        public Builder keystorePassword(@Nullable Output<String> keystorePassword) {
            $.keystorePassword = keystorePassword;
            return this;
        }

        /**
         * @param keystorePassword Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided keystore. For the self-signed certificate, this password is generated by Dataproc.
         * 
         * @return builder
         * 
         */
        public Builder keystorePassword(String keystorePassword) {
            return keystorePassword(Output.of(keystorePassword));
        }

        /**
         * @param kmsKey Optional. The uri of the KMS key used to encrypt various sensitive files.
         * 
         * @return builder
         * 
         */
        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            $.kmsKey = kmsKey;
            return this;
        }

        /**
         * @param kmsKey Optional. The uri of the KMS key used to encrypt various sensitive files.
         * 
         * @return builder
         * 
         */
        public Builder kmsKey(String kmsKey) {
            return kmsKey(Output.of(kmsKey));
        }

        /**
         * @param realm Optional. The name of the on-cluster Kerberos realm. If not specified, the uppercased domain of hostnames will be the realm.
         * 
         * @return builder
         * 
         */
        public Builder realm(@Nullable Output<String> realm) {
            $.realm = realm;
            return this;
        }

        /**
         * @param realm Optional. The name of the on-cluster Kerberos realm. If not specified, the uppercased domain of hostnames will be the realm.
         * 
         * @return builder
         * 
         */
        public Builder realm(String realm) {
            return realm(Output.of(realm));
        }

        /**
         * @param rootPrincipalPassword Optional. The Cloud Storage URI of a KMS encrypted file containing the root principal password.
         * 
         * @return builder
         * 
         */
        public Builder rootPrincipalPassword(@Nullable Output<String> rootPrincipalPassword) {
            $.rootPrincipalPassword = rootPrincipalPassword;
            return this;
        }

        /**
         * @param rootPrincipalPassword Optional. The Cloud Storage URI of a KMS encrypted file containing the root principal password.
         * 
         * @return builder
         * 
         */
        public Builder rootPrincipalPassword(String rootPrincipalPassword) {
            return rootPrincipalPassword(Output.of(rootPrincipalPassword));
        }

        /**
         * @param tgtLifetimeHours Optional. The lifetime of the ticket granting ticket, in hours. If not specified, or user specifies 0, then default value 10 will be used.
         * 
         * @return builder
         * 
         */
        public Builder tgtLifetimeHours(@Nullable Output<Integer> tgtLifetimeHours) {
            $.tgtLifetimeHours = tgtLifetimeHours;
            return this;
        }

        /**
         * @param tgtLifetimeHours Optional. The lifetime of the ticket granting ticket, in hours. If not specified, or user specifies 0, then default value 10 will be used.
         * 
         * @return builder
         * 
         */
        public Builder tgtLifetimeHours(Integer tgtLifetimeHours) {
            return tgtLifetimeHours(Output.of(tgtLifetimeHours));
        }

        /**
         * @param truststore Optional. The Cloud Storage URI of the truststore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
         * 
         * @return builder
         * 
         */
        public Builder truststore(@Nullable Output<String> truststore) {
            $.truststore = truststore;
            return this;
        }

        /**
         * @param truststore Optional. The Cloud Storage URI of the truststore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
         * 
         * @return builder
         * 
         */
        public Builder truststore(String truststore) {
            return truststore(Output.of(truststore));
        }

        /**
         * @param truststorePassword Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided truststore. For the self-signed certificate, this password is generated by Dataproc.
         * 
         * @return builder
         * 
         */
        public Builder truststorePassword(@Nullable Output<String> truststorePassword) {
            $.truststorePassword = truststorePassword;
            return this;
        }

        /**
         * @param truststorePassword Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided truststore. For the self-signed certificate, this password is generated by Dataproc.
         * 
         * @return builder
         * 
         */
        public Builder truststorePassword(String truststorePassword) {
            return truststorePassword(Output.of(truststorePassword));
        }

        public WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfigArgs build() {
            return $;
        }
    }

}
