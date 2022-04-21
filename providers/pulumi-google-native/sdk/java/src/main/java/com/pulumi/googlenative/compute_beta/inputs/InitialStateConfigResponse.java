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
    private List<FileContentBufferResponse> dbs;

    public List<FileContentBufferResponse> dbs() {
        return this.dbs;
    }

    /**
     * The forbidden key database (dbx).
     * 
     */
    @Import(name="dbxs", required=true)
    private List<FileContentBufferResponse> dbxs;

    public List<FileContentBufferResponse> dbxs() {
        return this.dbxs;
    }

    /**
     * The Key Exchange Key (KEK).
     * 
     */
    @Import(name="keks", required=true)
    private List<FileContentBufferResponse> keks;

    public List<FileContentBufferResponse> keks() {
        return this.keks;
    }

    /**
     * The Platform Key (PK).
     * 
     */
    @Import(name="pk", required=true)
    private FileContentBufferResponse pk;

    public FileContentBufferResponse pk() {
        return this.pk;
    }

    private InitialStateConfigResponse() {}

    private InitialStateConfigResponse(InitialStateConfigResponse $) {
        this.dbs = $.dbs;
        this.dbxs = $.dbxs;
        this.keks = $.keks;
        this.pk = $.pk;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InitialStateConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InitialStateConfigResponse $;

        public Builder() {
            $ = new InitialStateConfigResponse();
        }

        public Builder(InitialStateConfigResponse defaults) {
            $ = new InitialStateConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder dbs(List<FileContentBufferResponse> dbs) {
            $.dbs = dbs;
            return this;
        }

        public Builder dbs(FileContentBufferResponse... dbs) {
            return dbs(List.of(dbs));
        }

        public Builder dbxs(List<FileContentBufferResponse> dbxs) {
            $.dbxs = dbxs;
            return this;
        }

        public Builder dbxs(FileContentBufferResponse... dbxs) {
            return dbxs(List.of(dbxs));
        }

        public Builder keks(List<FileContentBufferResponse> keks) {
            $.keks = keks;
            return this;
        }

        public Builder keks(FileContentBufferResponse... keks) {
            return keks(List.of(keks));
        }

        public Builder pk(FileContentBufferResponse pk) {
            $.pk = pk;
            return this;
        }

        public InitialStateConfigResponse build() {
            $.dbs = Objects.requireNonNull($.dbs, "expected parameter 'dbs' to be non-null");
            $.dbxs = Objects.requireNonNull($.dbxs, "expected parameter 'dbxs' to be non-null");
            $.keks = Objects.requireNonNull($.keks, "expected parameter 'keks' to be non-null");
            $.pk = Objects.requireNonNull($.pk, "expected parameter 'pk' to be non-null");
            return $;
        }
    }

}
