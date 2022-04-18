// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The ssl configuration for scoring
 * 
 */
public final class SslConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SslConfigurationArgs Empty = new SslConfigurationArgs();

    /**
     * Cert data
     * 
     */
    @Import(name="cert")
      private final @Nullable Output<String> cert;

    public Output<String> cert() {
        return this.cert == null ? Codegen.empty() : this.cert;
    }

    /**
     * CNAME of the cert
     * 
     */
    @Import(name="cname")
      private final @Nullable Output<String> cname;

    public Output<String> cname() {
        return this.cname == null ? Codegen.empty() : this.cname;
    }

    /**
     * Key data
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> key() {
        return this.key == null ? Codegen.empty() : this.key;
    }

    /**
     * Enable or disable ssl for scoring
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public SslConfigurationArgs(
        @Nullable Output<String> cert,
        @Nullable Output<String> cname,
        @Nullable Output<String> key,
        @Nullable Output<String> status) {
        this.cert = cert;
        this.cname = cname;
        this.key = key;
        this.status = status;
    }

    private SslConfigurationArgs() {
        this.cert = Codegen.empty();
        this.cname = Codegen.empty();
        this.key = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cert;
        private @Nullable Output<String> cname;
        private @Nullable Output<String> key;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(SslConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.cname = defaults.cname;
    	      this.key = defaults.key;
    	      this.status = defaults.status;
        }

        public Builder cert(@Nullable Output<String> cert) {
            this.cert = cert;
            return this;
        }
        public Builder cert(@Nullable String cert) {
            this.cert = Codegen.ofNullable(cert);
            return this;
        }
        public Builder cname(@Nullable Output<String> cname) {
            this.cname = cname;
            return this;
        }
        public Builder cname(@Nullable String cname) {
            this.cname = Codegen.ofNullable(cname);
            return this;
        }
        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Codegen.ofNullable(key);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public SslConfigurationArgs build() {
            return new SslConfigurationArgs(cert, cname, key, status);
        }
    }
}
