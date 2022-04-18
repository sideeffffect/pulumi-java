// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.inputs.FileContentBufferResponse;
import java.util.List;
import java.util.Objects;


/**
 * Initial State for shielded instance, these are public keys which are safe to store in public
 * 
 */
public final class InitialStateConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final InitialStateConfigResponse Empty = new InitialStateConfigResponse();

    /**
     * The Key Database (db).
     * 
     */
    @Import(name="dbs", required=true)
      private final List<FileContentBufferResponse> dbs;

    public List<FileContentBufferResponse> dbs() {
        return this.dbs;
    }

    /**
     * The forbidden key database (dbx).
     * 
     */
    @Import(name="dbxs", required=true)
      private final List<FileContentBufferResponse> dbxs;

    public List<FileContentBufferResponse> dbxs() {
        return this.dbxs;
    }

    /**
     * The Key Exchange Key (KEK).
     * 
     */
    @Import(name="keks", required=true)
      private final List<FileContentBufferResponse> keks;

    public List<FileContentBufferResponse> keks() {
        return this.keks;
    }

    /**
     * The Platform Key (PK).
     * 
     */
    @Import(name="pk", required=true)
      private final FileContentBufferResponse pk;

    public FileContentBufferResponse pk() {
        return this.pk;
    }

    public InitialStateConfigResponse(
        List<FileContentBufferResponse> dbs,
        List<FileContentBufferResponse> dbxs,
        List<FileContentBufferResponse> keks,
        FileContentBufferResponse pk) {
        this.dbs = Objects.requireNonNull(dbs, "expected parameter 'dbs' to be non-null");
        this.dbxs = Objects.requireNonNull(dbxs, "expected parameter 'dbxs' to be non-null");
        this.keks = Objects.requireNonNull(keks, "expected parameter 'keks' to be non-null");
        this.pk = Objects.requireNonNull(pk, "expected parameter 'pk' to be non-null");
    }

    private InitialStateConfigResponse() {
        this.dbs = List.of();
        this.dbxs = List.of();
        this.keks = List.of();
        this.pk = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InitialStateConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FileContentBufferResponse> dbs;
        private List<FileContentBufferResponse> dbxs;
        private List<FileContentBufferResponse> keks;
        private FileContentBufferResponse pk;

        public Builder() {
    	      // Empty
        }

        public Builder(InitialStateConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbs = defaults.dbs;
    	      this.dbxs = defaults.dbxs;
    	      this.keks = defaults.keks;
    	      this.pk = defaults.pk;
        }

        public Builder dbs(List<FileContentBufferResponse> dbs) {
            this.dbs = Objects.requireNonNull(dbs);
            return this;
        }
        public Builder dbs(FileContentBufferResponse... dbs) {
            return dbs(List.of(dbs));
        }
        public Builder dbxs(List<FileContentBufferResponse> dbxs) {
            this.dbxs = Objects.requireNonNull(dbxs);
            return this;
        }
        public Builder dbxs(FileContentBufferResponse... dbxs) {
            return dbxs(List.of(dbxs));
        }
        public Builder keks(List<FileContentBufferResponse> keks) {
            this.keks = Objects.requireNonNull(keks);
            return this;
        }
        public Builder keks(FileContentBufferResponse... keks) {
            return keks(List.of(keks));
        }
        public Builder pk(FileContentBufferResponse pk) {
            this.pk = Objects.requireNonNull(pk);
            return this;
        }        public InitialStateConfigResponse build() {
            return new InitialStateConfigResponse(dbs, dbxs, keks, pk);
        }
    }
}
